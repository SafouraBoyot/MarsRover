public class Grid {
    private final Dimensions dimensions;

    public Grid(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void move(Rover rover, String navigationInstructions) {
        for (Character navigationInstruction : navigationInstructions.toCharArray()) {
            if (navigationInstruction.equals('R')) rover.rotateRight();
            if (navigationInstruction.equals('L')) rover.rotateLeft();
            if (navigationInstruction.equals('M')) rover.updateCoordinate();
        }
    }


    public Dimensions dimensions() {
        return dimensions;
    }


}
