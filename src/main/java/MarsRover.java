public class MarsRover {
    public Position execute(String inputCommand) {
        InputCommand command = InputParser.parse(inputCommand);

        Grid grid = new Grid(command.gridDimensions());
        Rover rover = new Rover(grid, command.position());

        rover.move(command.navigationInstructions());

        return rover.position();
    }
}
