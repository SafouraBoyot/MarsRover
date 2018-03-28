import java.util.Objects;

public class Position {
    private Coordinate coordinate;
    private Direction direction;

    public Position(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }


    public Coordinate coordinate() {
        return coordinate;
    }

    public Direction direction() {
        return direction;
    }

    public void direction(Direction direction) {
        this.direction = direction;
    }



    public void coordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
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
