public class InputParser {
    public static InputCommand parse(String inputCommand) {
        String[] splitByNewLine = inputCommand.split("\\n");
        String[] dimensionsAsArray = splitByNewLine[0].split(" ");
        Dimensions dimensions = new Dimensions(
                Integer.parseInt(dimensionsAsArray[0]),
                Integer.parseInt(dimensionsAsArray[1])
        );

        String[] positionAsArray = splitByNewLine[1].split(" ");
        Position position = new Position(new Coordinate(positionAsArray))
    }
}
