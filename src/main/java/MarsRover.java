public class MarsRover {
    public Position execute(String inputCommand) {
        InputCommand command = InputParser.parse(inputCommand);

        Rover rover = new Rover(command.gridDimensions(), command.position());


        rover.move(command.navigationInstructions());

        return rover.position();
    }
}
