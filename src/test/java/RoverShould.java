import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverShould {
    @Test
    public void
    rotate_right() {
        Rover rover = new Rover(new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.rotateRight();
        assertEquals(Direction.EAST, rover.position().direction());
    }

    @Test public void
    rotate_left(){
        Rover rover = new Rover(new Position(new Coordinate(1, 2), Direction.NORTH));

        rover.rotateLeft();
        assertEquals(Direction.WEST, rover.position().direction());
    }
}
