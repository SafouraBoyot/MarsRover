public class Grid {
    private int[][] grid;
    private int dimensions;

    public void size(Dimensions dimensions) {
            grid = new int[dimensions.width()][dimensions.height()];
    }

    public void move(Rover rover, String navigationInstruction) {
        if(navigationInstruction.equals("R")) rover.rotateRight();
        if(navigationInstruction.equals("L")) rover.rotateLeft();
    }
}
