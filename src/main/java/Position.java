import java.util.Objects;

public class Position {
    private final Coordinate coordinate;
    private final Direction direction;

    public Position(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(coordinate, position.coordinate) &&
                direction == position.direction;
    }

    @Override
    public int hashCode() {

        return Objects.hash(coordinate, direction);
    }
}
