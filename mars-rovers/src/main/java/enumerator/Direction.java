package enumerator;

public enum Direction {

    NORTH, EAST, SOUTH, WEST;

    static {
        NORTH.left = WEST;
        NORTH.right = EAST;
        WEST.left = SOUTH;
        WEST.right = NORTH;
        EAST.left = NORTH;
        EAST.right = SOUTH;
        SOUTH.left = EAST;
        SOUTH.right = WEST;
    }

    private Direction left;
    private Direction right;

    public Direction getLeft(){
        return this.left;
    }

    public Direction getRight(){
        return this.right;
    }

}
