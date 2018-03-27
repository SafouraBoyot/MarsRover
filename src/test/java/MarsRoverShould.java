import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;

public class MarsRoverShould {
    @Mock
    OutPutInterface outPutInterface;

    @Test
    public void
    announce_new_position_of_a_rover() {

        Report report = new Report(formatter, outPutInterface)
        Grid grid = new Grid();
        String inputCommand = "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n";

        MarsRover marsRover = new MarsRover(grid);
        marsRover.execute(inputCommand);


        verify(outPutInterface).print("1 3 N");
    }
}
