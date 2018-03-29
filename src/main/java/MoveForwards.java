public class MoveForwards implements Command {
    private final Rover rover;

    public MoveForwards(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.position().coordinate(nextCoordinateFor(rover.position()));

    }
    private void updateCoordinate() {
        rover.position().coordinate(nextCoordinateFor(rover.position()));
    }


    private Coordinate nextCoordinateFor(Position position) {
        return new Coordinate(updatedX(position), updatedY(position));

    }

    private int updatedX(Position position) {
        int x = position.coordinate().x();

        if (position.direction().equals(Direction.EAST)) {
            return x + 1 > rover.grid().width() ? 1 : x + 1;
        }

        if (position.direction().equals(Direction.WEST)) {
            return x - 1 < 1 ? rover.grid().width() : x - 1;
        }

        return x;
    }

    private int updatedY(Position position) {
        int y = position.coordinate().y();

        if (position.direction().equals(Direction.NORTH)) {
            return y + 1 > rover.grid().height() ? 1 : y + 1;
        }

        if (position.direction().equals(Direction.SOUTH)) {
            return y - 1 < 1 ? rover.grid().height() : y - 1;
        }

        return y;
    }

}
