public class RotateLeft implements Command {
    private final Rover rover;

    public RotateLeft(Rover rover) {

        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.position().direction(rover.position().direction().left());
    }
}
