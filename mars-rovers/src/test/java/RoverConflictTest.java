import entity.Plateau;
import entity.Rover;
import enumerator.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverConflictTest {


    private Rover rover;
    private Plateau plateau;

    @Before
    public void setUp() {
        plateau = new Plateau(2, 2);
        plateau.placeRover( new Rover(1, 1, Direction.NORTH));
    }

    @Test
    public void roverConflictWhileMoveNorthTest() {
        rover = new Rover(1, 0, Direction.NORTH);
        plateau.moveRover(rover);
        Assert.assertEquals(1, rover.getCoordinateX());
        Assert.assertEquals(0, rover.getCoordinateY());
    }

    @Test
    public void roverConflictWhileMoveEastTest() {
        rover = new Rover(0, 1, Direction.EAST);
        plateau.moveRover(rover);
        Assert.assertEquals(0, rover.getCoordinateX());
        Assert.assertEquals(1, rover.getCoordinateY());
    }

    @Test
    public void roverConflictWhileMoveSouthTest() {
        rover = new Rover(1, 2, Direction.SOUTH);
        plateau.moveRover(rover);
        Assert.assertEquals(1, rover.getCoordinateX());
        Assert.assertEquals(2, rover.getCoordinateY());
    }

    @Test
    public void roverConflictWhileMoveWestTest() {
        rover = new Rover(2, 1, Direction.WEST);
        plateau.moveRover(rover);
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(1, rover.getCoordinateY());
    }
}
