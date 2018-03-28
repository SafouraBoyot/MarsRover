import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GridShould {
    @Mock
    private Rover rover;

    private Grid grid;

    @Before
    public void
    setUp() {
        this.grid = new Grid(new Dimensions(5,5));
    }

    @Test
    public void
    rotate_rover_right() {
        when(rover.position()).thenReturn(new Position(new Coordinate(1, 2), Direction.NORTH));

        grid.move(rover, "R");

        verify(rover).rotateRight();
    }

    @Test
    public void
    rotate_rover_left() {
        when(rover.position()).thenReturn(new Position(new Coordinate(1, 2), Direction.NORTH));

        grid.move(rover, "L");

        verify(rover).rotateLeft();
    }

    @Test public void
    move_rover(){
        when(rover.position()).thenReturn(new Position(new Coordinate(1, 2), Direction.NORTH));

        grid.move(rover, "M");

        verify(rover).changeCoordinate(new Coordinate(1,3));
    }

    @Test
    public void
    move_rover_based_on_multiple_commands() {
        Position positionBefore = new Position(new Coordinate(1, 2), Direction.NORTH);
        Position positionAfter = new Position(new Coordinate(1, 2), Direction.EAST);
        when(rover.position()).thenReturn(positionBefore)
                .thenReturn(positionAfter);

        grid.move(rover, "RM");

        verify(rover).changeCoordinate(new Coordinate(2,2));
    }

    @Test
    public void
    make_rover_wrap_around_the_grid_on_the_y_axis() {
        Position position = new Position(new Coordinate(5, 5), Direction.NORTH);

        when(rover.position()).thenReturn(position);

        grid.move(rover, "M");

        verify(rover).changeCoordinate(new Coordinate(5,1));
    }

    @Test
    public void
    make_rover_wrap_around_the_grid_on_the_x_axis() {
        Position position = new Position(new Coordinate(1, 3), Direction.WEST);

        when(rover.position()).thenReturn(position);

        grid.move(rover, "M");

        verify(rover).changeCoordinate(new Coordinate(5,3));
    }
}

