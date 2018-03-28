import java.util.Objects;

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
        return gridDimensions;
    }

    public Position position() {
        return position;
    }

    public String navigationInstructions() {
        return navigationInstructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputCommand that = (InputCommand) o;
        return Objects.equals(gridDimensions, that.gridDimensions) &&
                Objects.equals(position, that.position) &&
                Objects.equals(navigationInstructions, that.navigationInstructions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gridDimensions, position, navigationInstructions);
    }
}
