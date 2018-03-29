import java.util.Objects;

public class Rover {
    private final Grid grid;
    private Position position;


    public Rover(Grid grid, Position position) {

        this.grid = grid;
        this.position = position;
    }

    public void move( String navigationInstructions) {
        for (Character navigationInstruction : navigationInstructions.toCharArray()) {
            if (navigationInstruction.equals('R')) this.rotateRight();
            if (navigationInstruction.equals('L')) this.rotateLeft();
            if (navigationInstruction.equals('M')) this.updateCoordinate();
        }
    }

    public Position position() {
        return position;
    }

    public void rotateRight() {
        position.direction(position.direction().right());
    }

    public void rotateLeft() {
        position.direction(position.direction().left());
    }

    public void updateCoordinate() {
        position.coordinate(nextCoordinateFor(position));
    }


    private Coordinate nextCoordinateFor(Position position) {
        return new Coordinate(updatedX(position), updatedY(position));

    }

    private int updatedX(Position position) {
        int x = position.coordinate().x();

        if (position.direction().equals(Direction.EAST)) {
            return x + 1 > grid.dimensions().width() ? 1 : x + 1;
        }

        if (position.direction().equals(Direction.WEST)) {
            return x - 1 < 1 ? grid.dimensions().width() : x - 1;
        }

        return x;
    }

    private int updatedY(Position position) {
        int y = position.coordinate().y();

        if (position.direction().equals(Direction.NORTH)) {
            return y + 1 > grid.dimensions().height() ? 1 : y + 1;
        }

        if (position.direction().equals(Direction.SOUTH)) {
            return y - 1 < 1 ? grid.dimensions().height() : y - 1;
        }

        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(grid, rover.grid) &&
                Objects.equals(position, rover.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grid, position);
    }
}
