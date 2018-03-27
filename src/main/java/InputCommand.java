public class InputCommand {
    private final Dimensions gridDimensions;
    private final Position position;
    private final String navigationInstructions;

    public InputCommand(Dimensions gridDimensions, Position position, String navigationInstructions) {
        this.gridDimensions = gridDimensions;
        this.position = position;
        this.navigationInstructions = navigationInstructions;
    }

    public Dimensions gridDimensions() {
        throw new UnsupportedOperationException();
    }

    public Position position() {
            throw new UnsupportedOperationException();
    }

    public String navigationInstruction() {
        throw new UnsupportedOperationException();
    }
}
