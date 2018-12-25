package entity;

import enumerator.Direction;

import static enumerator.Direction.NORTH;

public class Rover {

    private int coordinateX;
    private int coordinateY;
    private Direction direction;

    public Rover(int coordinateX, int coordinateY, Direction direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public void turnLeft() {
        this.direction = direction.getLeft();
    }

    public void turnRight() {
        this.direction = direction.getRight();
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move() {
        switch (this.direction) {
            case NORTH:
                coordinateY = coordinateY+1;
                break;
            case EAST:
                coordinateX = coordinateX+1;
                break;
            case SOUTH:
                coordinateY = coordinateY-1;
                break;
            case WEST:
                coordinateX = coordinateX-1;
                break;
        }
    }

}
