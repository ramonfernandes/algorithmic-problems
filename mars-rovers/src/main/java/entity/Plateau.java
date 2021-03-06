package entity;

import enumerator.Direction;
import exception.NoValidPositionException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Plateau {

    private int xSize;

    public List<Rover> getPlateau() {
        return plateau;
    }

    private int ySize;

    List<Rover> plateau;

    public Plateau(int xSize, int ySize) {
        plateau = new ArrayList<>();
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void landRover(Rover rover) throws NoValidPositionException {
        if (checkLocationAvaliable(rover.getCoordinateX(), rover.getCoordinateY()))
            placeRover(rover);
        else {
            rover = findNewPositionToLandTheRover(rover);
            placeRover(rover);
        }
    }

    private Rover findNewPositionToLandTheRover(Rover rover) throws NoValidPositionException {
        Direction semaphore = Direction.NORTH;
        int firstCoordinateTriedX = rover.getCoordinateX();
        int firstCoordinateTriedY = rover.getCoordinateY();
        int count = 0;
        while (!checkLocationAvaliable(rover.getCoordinateX(), rover.getCoordinateY())) {
            switch (semaphore) {
                case NORTH:
                    count += 1;
                    rover = new Rover(firstCoordinateTriedX, firstCoordinateTriedY + count, rover.getDirection());
                    break;
                case EAST:
                    rover = new Rover(firstCoordinateTriedX + count, firstCoordinateTriedY, rover.getDirection());
                    break;
                case SOUTH:
                    rover = new Rover(firstCoordinateTriedX, firstCoordinateTriedY - count, rover.getDirection());
                    break;
                case WEST:
                    rover = new Rover(firstCoordinateTriedX - count, firstCoordinateTriedY, rover.getDirection());
                    break;
            }
            semaphore = semaphore.getRight();
            if (firstCoordinateTriedX + count > xSize
                    && firstCoordinateTriedY + count > ySize
                    && firstCoordinateTriedX - count < 0
                    && firstCoordinateTriedY - count < 0) {
                throw new NoValidPositionException();
            }
        }
        return rover;
    }

    public void moveRover(Rover rover) {
        if (checkIfIsPossibleToMove(rover))
            rover.move();
    }

    private boolean checkIfIsPossibleToMove(Rover rover) {
        switch (rover.getDirection()) {
            case NORTH:
                return checkLocationAvaliable(rover.getCoordinateX(), rover.getCoordinateY() + 1);
            case EAST:
                return checkLocationAvaliable(rover.getCoordinateX() + 1, rover.getCoordinateY());
            case SOUTH:
                return checkLocationAvaliable(rover.getCoordinateX(), rover.getCoordinateY() - 1);
            case WEST:
                return checkLocationAvaliable(rover.getCoordinateX() - 1, rover.getCoordinateY());
        }
        return false;
    }

    private boolean checkLocationAvaliable(int coordinateX, int coordinateY) {
        return coordinateY <= ySize
                && coordinateY >= 0
                && coordinateX <= xSize
                && coordinateX >= 0
                && !checkRoverCollision(coordinateX, coordinateY);
    }

    private boolean checkRoverCollision(int coordinateX, int coordinateY) {
        return plateau.stream()
                .anyMatch(roverPlaced -> roverPlaced.getCoordinateX() == coordinateX &&
                        roverPlaced.getCoordinateY() == coordinateY);
    }

    public boolean placeRover(Rover rover) {
        return plateau.add(rover);
    }

    public void readAndExecuteCommands(Rover rover, String commands) {
        try {
            landRover(rover);
            commands.chars().mapToObj(e -> (char) e)
                    .forEachOrdered(command -> {
                        switch (command) {
                            case 'L':
                                rover.turnLeft();
                                break;
                            case 'R':
                                rover.turnRight();
                                break;
                            case 'M':
                                moveRover(rover);
                                break;
                        }
                    });

        } catch (NoValidPositionException e) {
            System.out.println(e.message);
        }
    }
}
