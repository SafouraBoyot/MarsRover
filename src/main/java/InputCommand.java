import java.util.Objects;

public class InputCommand {
    private final Grid grid;
    private final Position position;
    private final String navigationInstructions;

    public InputCommand(Grid grid, Position position, String navigationInstructions) {
        this.grid = grid;
        this.position = position;
        this.navigationInstructions = navigationInstructions;
    }

    public Grid gridDimensions() {
        return grid;
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
        return Objects.equals(grid, that.grid) &&
                Objects.equals(position, that.position) &&
                Objects.equals(navigationInstructions, that.navigationInstructions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(grid, position, navigationInstructions);
    }
}
