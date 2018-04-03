
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rover {
    private final Grid grid;
    private Position position;


    public Rover(Grid grid, Position position) {

        this.grid = grid;
        this.position = position;
    }

    public void move(String navigationInstructions) {
        List<Command> commands = getCommands(navigationInstructions);
        for (Command c : commands) {
            c.execute();
        }
    }
    
    public Position position() {
        return position;
    }

    public Grid grid() {
        return grid;
    }

    private List<Command> getCommands(String navigationInstructions) {
        List<Command> commands = new ArrayList<>();
        for (Character navigationInstruction : navigationInstructions.toCharArray()) {
            if (navigationInstruction.equals(NavigationInstruction.RIGHT.value())) commands.add(new RotateRight(this));
            if (navigationInstruction.equals(NavigationInstruction.LEFT.value())) commands.add(new RotateLeft(this));
            if (navigationInstruction.equals(NavigationInstruction.MOVE_FORWARD.value())) commands.add(new MoveForwards(this));
        }
        return commands;
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
