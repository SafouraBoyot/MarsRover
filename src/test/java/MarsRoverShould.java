import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class MarsRoverShould {
    @Mock
    private OutPutInterface outPutInterface;

    @Test
    public void
    announce_new_position_of_a_rover() {


        Reporter report = new Reporter(outPutInterface);
        Grid grid = new Grid(new Dimensions(5,5));
        String inputCommand = "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n";

        MarsRover marsRover = new MarsRover(grid, report);
        marsRover.execute(inputCommand);


        verify(outPutInterface).print("1 3 N");
    }
}
