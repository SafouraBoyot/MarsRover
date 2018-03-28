public class Grid {
    private int[][] grid;
    private Dimensions dimensions;

    public Grid(Dimensions dimensions) {
        this.dimensions = dimensions;
        grid = new int[dimensions.width()][dimensions.height()];

    }

    public void move(Rover rover, String navigationInstruction) {
        if (navigationInstruction.equals("R")) rover.rotateRight();
        if (navigationInstruction.equals("L")) rover.rotateLeft();
        if (navigationInstruction.equals("M")) {
            Coordinate coordinate = rover.position().coordinate();
            if (rover.position().direction().equals(Direction.NORTH))
                rover.changeCoordinate(new Coordinate(coordinate.x(), coordinate.y() + 1));
            if (rover.position().direction().equals(Direction.SOUTH))
                rover.changeCoordinate(new Coordinate(coordinate.x(), coordinate.y() - 1));
        }


    }
}
