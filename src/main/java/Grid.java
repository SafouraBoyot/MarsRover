public class Grid {
    private int[][] grid;
    private Dimensions dimensions;

    public Grid(Dimensions dimensions) {
        this.dimensions = dimensions;
        grid = new int[dimensions.width()][dimensions.height()];
    }

    public void move(Rover rover, String navigationInstructions) {
        for (Character navigationInstruction : navigationInstructions.toCharArray()) {
            Position position = rover.position();

            if (navigationInstruction.equals('R')) rover.rotateRight();
            if (navigationInstruction.equals('L')) rover.rotateLeft();
            if (navigationInstruction.equals('M')) {
                rover.changeCoordinate(nextCoordinateFor(position));
            }
        }
    }

    private Coordinate nextCoordinateFor(Position position) {
        int x = position.coordinate().x();
        int y = position.coordinate().y();
        int nextX = x;
        int nextY = y;

        if (position.direction().equals(Direction.NORTH)) {
            nextY = y + 1 > dimensions.height() ? 1 : y + 1;
        }

        if (position.direction().equals(Direction.SOUTH)) {
            nextY = y - 1 < 1 ? dimensions.height() : y - 1;
        }

        if (position.direction().equals(Direction.EAST)) {
            nextX = x + 1 > dimensions.width() ? 1 : x + 1;
        }

        if (position.direction().equals(Direction.WEST)) {
            nextX = x - 1 < 1 ? dimensions.width() : x - 1;
        }

        return new Coordinate(nextX, nextY);
    }
}
