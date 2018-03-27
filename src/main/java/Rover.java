public class Rover {
    private final Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position position() {
        throw new UnsupportedOperationException();
    }
}
