public class Rover {
    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position position() {
        return position;
    }

    public void rotateRight() {
        throw new UnsupportedOperationException();
    }

    public void rotateLeft() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return position != null ? position.equals(rover.position) : rover.position == null;
    }

    @Override
    public int hashCode() {
        return position != null ? position.hashCode() : 0;
    }

}
