public class MarsRover {
    private final Grid grid;
    private final Reporter reporter;

    public MarsRover(Grid grid, Reporter reporter) {
        this.grid = grid;
        this.reporter = reporter;
    }

    public void execute(String inputCommand) {
        InputCommand command = InputParser.parse(inputCommand);
        grid.size(command.gridDimensions());
        Rover rover = new Rover(command.position());

        grid.move(rover, command.navigationInstruction());

        reporter.print(rover);
    }
}
