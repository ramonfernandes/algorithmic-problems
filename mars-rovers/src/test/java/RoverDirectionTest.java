import entity.Rover;
import enumerator.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverDirectionTest {

    private Rover rover;

    @Before
    public void setUp(){
        rover = new Rover(0,0, Direction.NORTH);
    }

    @Test
    public void turnLeftTest(){
        rover.turnLeft();
        Assert.assertEquals(Direction.WEST, rover.getDirection());
        rover.turnLeft();
        Assert.assertEquals(Direction.SOUTH, rover.getDirection());
        rover.turnLeft();
        Assert.assertEquals(Direction.EAST, rover.getDirection());
        rover.turnLeft();
        Assert.assertEquals(Direction.NORTH, rover.getDirection());
    }


    @Test
    public void turnRightTest(){
        rover.turnRight();
        Assert.assertEquals(Direction.EAST, rover.getDirection());
        rover.turnRight();
        Assert.assertEquals(Direction.SOUTH, rover.getDirection());
        rover.turnRight();
        Assert.assertEquals(Direction.WEST, rover.getDirection());
        rover.turnRight();
        Assert.assertEquals(Direction.NORTH, rover.getDirection());
    }

}
