public class MarsRover {
    private final Grid grid;

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public void execute(String inputCommand) {
        InputCommand command = InputParser.parse(inputCommand);
        grid.size(command.gridSize());
        Rover rover = new Rover(command.position());

        Rover newRover = grid.move(rover, command.navigationInstruction());


    }
}
