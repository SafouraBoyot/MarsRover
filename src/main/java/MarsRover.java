public class MarsRover {
    private final Grid grid;
    private final Reporter reporter;

    public MarsRover(Grid grid, Reporter reporter) {
        this.grid = grid;
        this.reporter = reporter;
    }


    public void execute(String inputCommand) {
        InputCommand command = InputParser.parse(inputCommand);
        Rover rover = new Rover(command.position());

        grid.move(rover, command.navigationInstructions());

        reporter.print(rover);
    }
}
