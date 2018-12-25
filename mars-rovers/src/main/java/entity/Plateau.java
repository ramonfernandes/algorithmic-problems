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
        return ((rover.getDirection().equals(Direction.NORTH) && (rover.getCoordinateY() < ySize))
            || (rover.getDirection().equals(Direction.SOUTH) && (rover.getCoordinateY() > 0))
            || (rover.getDirection().equals(Direction.EAST) && (rover.getCoordinateX() < xSize))
            || (rover.getDirection().equals(Direction.WEST) && (rover.getCoordinateX() > 0)));
    }
}
