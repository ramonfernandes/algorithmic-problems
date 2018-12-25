package mapper;

import enumerator.Direction;

public class Mapper {

    public static Direction mapStringToDirection(String direction){
        switch (direction){
            case "N":
                return Direction.NORTH;
            case "S":
                return Direction.SOUTH;
            case "E":
                return Direction.EAST;
            case "W":
                return Direction.WEST;
        }
        return Direction.NORTH;
    }

}
