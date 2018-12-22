package entity;

import enumerator.Direction;

public class Rover {

    private int coordinateX;
    private int coordinateY;
    private Direction direction;

    public Rover(int coordinateX, int coordinateY, Direction direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public void turnLeft(){
        this.direction = direction.getLeft();
    }

    public void turnRight(){
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
}
