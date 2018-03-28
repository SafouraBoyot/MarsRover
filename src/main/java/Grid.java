public class Grid {
    private Dimensions dimensions;

    public Grid(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void move(Rover rover, String navigationInstructions) {
        for (Character navigationInstruction : navigationInstructions.toCharArray()) {
            Position position = rover.position();

            if (navigationInstruction.equals('R')) rover.rotateRight();
            if (navigationInstruction.equals('L')) rover.rotateLeft();
            if (navigationInstruction.equals('M')) rover.updateCoordinate(nextCoordinateFor(position));
        }
    }

    private Coordinate nextCoordinateFor(Position position) {
        return new Coordinate(updatedX(position), updatedY(position));
    }

    private int updatedX(Position position) {
        int x = position.coordinate().x();

        if (position.direction().equals(Direction.EAST)) {
            return x + 1 > dimensions.width() ? 1 : x + 1;
        }

        if (position.direction().equals(Direction.WEST)) {
            return x - 1 < 1 ? dimensions.width() : x - 1;
        }

        return x;
    }

    private int updatedY(Position position) {
        int y = position.coordinate().y();

        if (position.direction().equals(Direction.NORTH)) {
            return y + 1 > dimensions.height() ? 1 : y + 1;
        }

        if (position.direction().equals(Direction.SOUTH)) {
            return y - 1 < 1 ? dimensions.height() : y - 1;
        }

        return y;
    }
}
