import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InputParserShould {
    @Test
    public void
    parse_a_string_to_commands() {

        Dimensions gridDimensions = new Dimensions(5, 5);
        Position position = new Position(new Coordinate(1, 2), Direction.NORTH);
        String navigationInstructions = "LMLMLMLMM";

        InputCommand expected = new InputCommand(gridDimensions, position, navigationInstructions);

        assertThat(InputParser.parse("5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM"), is(expected));
    }
}
