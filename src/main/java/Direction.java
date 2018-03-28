public enum Direction {
    NORTH("N", "W", "E"),
    SOUTH("S", "E", "W"),
    EAST("E", "N", "S"),
    WEST("W", "S", "N");


    private final String current;
    private final String left;
    private final String right;

    Direction(String current, String left, String right) {
        this.current = current;
        this.left = left;
        this.right = right;
    }

    public String current() {
        return current;
    }

    public Direction left() {
        for (Direction direction : values()) {
            if (this.left.equals(direction.current)) return direction;
        }
        return null;
    }

    public Direction right() {
        for (Direction direction : values()) {
            if (this.right.equals(direction.current)) return direction;
        }
        return null;
    }

}
