package entity;

import enumerator.Direction;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private int xSize;
    private int ySize;

    List<Rover> plateau;

    public Plateau(int xSize, int ySize) {
        plateau = new ArrayList<>();
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void moveRover(Rover rover) {
        if (checkIfIsPossibleToMove(rover))
            rover.move();
    }

    private boolean checkIfIsPossibleToMove(Rover rover) {
        switch (rover.getDirection()) {
            case NORTH:
                return checkRoverConflict(rover.getCoordinateX(), rover.getCoordinateY() + 1);
            case EAST:
                return checkRoverConflict(rover.getCoordinateX() + 1, rover.getCoordinateY());
            case SOUTH:
                return checkRoverConflict(rover.getCoordinateX(), rover.getCoordinateY() - 1);
            case WEST:
                return checkRoverConflict(rover.getCoordinateX() - 1 , rover.getCoordinateY());
        }
        return false;
    }

    private boolean checkRoverConflict(int coordinateX, int coordinateY) {
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

    public boolean placeRover(Rover rover){
        return plateau.add(rover);
    }
}
