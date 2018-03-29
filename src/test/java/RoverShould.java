import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverShould {
    private Grid grid;

    @Before
    public void
    setUp() {
        grid = new Grid(5, 5);
    }

    @Test
    public void
    rotate_right() {
        Rover rover = new Rover(grid, new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.move("R");

        assertThat( rover.position().direction(),is(Direction.EAST));
    }

    @Test
    public void
    rotate_left() {
        Rover rover = new Rover(grid, new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.move("L");

        assertThat(rover.position().direction(),is(Direction.WEST));
    }

    @Test
    public void
    change_coordinate() {
        Rover rover = new Rover(grid, new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.move("M");
        Coordinate actualCoordinate = rover.position().coordinate();

        assertThat(actualCoordinate, is(new Coordinate(1, 3)));
    }
}
