import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GridShould {


    @Test
    public void
    return_dimensions() {

        Grid actualGrid = new Grid(new Dimensions(5,5));
        Dimensions expectedDimensions = new Dimensions(5,5);

        Dimensions actualDimensions = actualGrid.dimensions();

        assertThat(actualDimensions,is(expectedDimensions));
    }





/*
    @Before
    public void
    setUp() {
        this.grid = new Grid(new Dimensions(5,5));
    }*/


    /*@Test
    public void
    move_rover_based_on_multiple_commands() {
        Position positionBefore = new Position(new Coordinate(1, 2), Direction.NORTH);
        Position positionAfter = new Position(new Coordinate(1, 2), Direction.EAST);
        when(rover.position()).thenReturn(positionBefore)
                .thenReturn(positionAfter);

        rover.move(rover, "RM");

        verify(rover).updateCoordinate();
    }

    @Test
    public void
    make_rover_wrap_around_the_grid_on_the_y_axis() {
        Position position = new Position(new Coordinate(5, 5), Direction.NORTH);

        when(rover.position()).thenReturn(position);

        rover.move(rover, "M");

        verify(rover).updateCoordinate();
    }

    @Test
    public void
    make_rover_wrap_around_the_grid_on_the_x_axis() {
        Position position = new Position(new Coordinate(1, 3), Direction.WEST);

        when(rover.position()).thenReturn(position);

        rover.move(rover, "M");

        verify(rover).updateCoordinate();
    }*/
}

