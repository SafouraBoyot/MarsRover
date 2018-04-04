public class RotateRight implements Command {

    private Rover rover;

    public RotateRight(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.position().direction(rover.position().direction().right());

    }

}
