public class MarsRover {
    public Position execute(String inputCommand) {
        InputCommand command = InputParser.parse(inputCommand);

        Rover rover = new Rover(command.position());
        Grid grid = new Grid(command.gridDimensions());

        grid.move(rover, command.navigationInstructions());

        return rover.position();
    }
}
