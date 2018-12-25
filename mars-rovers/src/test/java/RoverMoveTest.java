import entity.Plateau;
import entity.Rover;
import enumerator.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverMoveTest {


    private Rover rover;
    private Plateau plateau;

    @Before
    public void setUp(){
        plateau = new Plateau(2, 2);
    }

    @Test
    public void moveNorth(){
        rover = new Rover(0, 0, Direction.NORTH);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(1, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
    }

    @Test
    public void moveEast(){
        rover = new Rover(0, 0, Direction.EAST);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(1, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
    }

    @Test
    public void moveSouth(){
        rover = new Rover(2, 2, Direction.SOUTH);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(1, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
    }

    @Test
    public void moveWest(){
        rover = new Rover(2, 2, Direction.WEST);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(1, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
        plateau.moveRover(rover);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
    }
}
