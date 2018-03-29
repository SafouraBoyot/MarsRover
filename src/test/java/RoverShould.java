import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverShould {
    private Grid grid;

    @Before
    public void
    setUp() {
        grid = new Grid(new Dimensions(5, 5));
    }

    @Test
    public void
    rotate_right() {
        Rover rover = new Rover(grid, new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.rotateRight();
        
        assertEquals(Direction.EAST, rover.position().direction());
    }

    @Test
    public void
    rotate_left() {
        Rover rover = new Rover(grid, new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.rotateLeft();

        assertEquals(Direction.WEST, rover.position().direction());
    }

    @Test
    public void
    change_coordinate() {
        Rover rover = new Rover(grid, new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.updateCoordinate();
        Coordinate actualCoordinate = rover.position().coordinate();

        assertEquals(actualCoordinate, new Coordinate(1, 3));
    }
}
