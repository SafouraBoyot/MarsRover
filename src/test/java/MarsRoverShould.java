import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverShould {
    @Test
    public void
    announce_new_position_of_a_rover() {
        String inputCommand = "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n";

        MarsRover marsRover = new MarsRover();

        Position expectedPosition = new Position(new Coordinate(1, 3), Direction.NORTH);
        Position actualPosition = marsRover.execute(inputCommand);

        assertThat(actualPosition, is(expectedPosition));
    }
}
