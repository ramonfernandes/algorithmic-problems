import entity.Plateau;
import entity.Rover;
import enumerator.Direction;
import exception.NoValidPositionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvalidRoverLandingTest {

    private Rover rover;
    private Plateau plateau;

    @Before
    public void setUp() {
        plateau = new Plateau(2, 2);
        plateau.placeRover( new Rover(1, 1, Direction.NORTH));
    }

    @Test (expected = NoValidPositionException.class)
    public void shouldThrowExceptionWhenTryToThrowASixthRover() throws NoValidPositionException {
        rover = new Rover(1, 1, Direction.NORTH);
        plateau.landRover(rover);
        plateau.landRover(rover);
        plateau.landRover(rover);
        plateau.landRover(rover);
        plateau.landRover(rover);
    }

    @Test
    public void shouldLandRoverToNorth() throws NoValidPositionException {
        rover = new Rover(1, 1, Direction.NORTH);
        plateau.landRover(rover);
        Assert.assertEquals(plateau.getPlateau().size(), 2);
        Assert.assertEquals(1, plateau.getPlateau().get(0).getCoordinateX());
        Assert.assertEquals(1, plateau.getPlateau().get(0).getCoordinateY());
        Assert.assertEquals(1, plateau.getPlateau().get(1).getCoordinateX());
        Assert.assertEquals(2,   plateau.getPlateau().get(1).getCoordinateY());
    }

    @Test
    public void shouldLandRoverToEast() throws NoValidPositionException {
        shouldLandRoverToNorth();
        rover = new Rover(1, 1, Direction.NORTH);
        plateau.landRover(rover);
        Assert.assertEquals(plateau.getPlateau().size(), 3);
        Assert.assertEquals(2, plateau.getPlateau().get(2).getCoordinateX());
        Assert.assertEquals(1,   plateau.getPlateau().get(2).getCoordinateY());
    }

    @Test
    public void shouldLandRoverToSouth() throws NoValidPositionException {
        shouldLandRoverToEast();
        rover = new Rover(1, 1, Direction.NORTH);
        plateau.landRover(rover);
        Assert.assertEquals(plateau.getPlateau().size(), 4);
        Assert.assertEquals(1, plateau.getPlateau().get(3).getCoordinateX());
        Assert.assertEquals(0,   plateau.getPlateau().get(3).getCoordinateY());
    }

    @Test
    public void shouldLandRoverToWest() throws NoValidPositionException {
        shouldLandRoverToSouth();
        rover = new Rover(1, 1, Direction.NORTH);
        plateau.landRover(rover);
        Assert.assertEquals(plateau.getPlateau().size(), 5);
        Assert.assertEquals(0, plateau.getPlateau().get(4).getCoordinateX());
        Assert.assertEquals(1,   plateau.getPlateau().get(4).getCoordinateY());
    }

}
