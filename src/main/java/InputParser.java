public class InputParser {
    public static InputCommand parse(String inputCommand) {
        String[] splitByNewLine = inputCommand.split("\\n");
        String[] dimensionsAsArray = splitByNewLine[0].split(" ");
        Dimensions dimensions = new Dimensions(
                Integer.parseInt(dimensionsAsArray[0]),
                Integer.parseInt(dimensionsAsArray[1])
        );

        String[] positionAsArray = splitByNewLine[1].split(" ");
        Direction direction = null;

        if (positionAsArray[2].equals("N")) direction = Direction.NORTH;
        if (positionAsArray[2].equals("S")) direction = Direction.SOUTH;
        if (positionAsArray[2].equals("E")) direction = Direction.EAST;
        if (positionAsArray[2].equals("W")) direction = Direction.WEST;

        Coordinate coordinate = new Coordinate(Integer.parseInt(positionAsArray[0]),
                Integer.parseInt(positionAsArray[1]));

        Position position = new Position(coordinate, direction);

        String navigationInstruction = splitByNewLine[2];

        return new InputCommand(dimensions, position, navigationInstruction);
    }
}
