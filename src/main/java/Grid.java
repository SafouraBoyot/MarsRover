import java.util.Objects;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grid that = (Grid) o;
        return width == that.width &&
                height == that.height;
    }

    @Override
    public int hashCode() {

        return Objects.hash(width, height);
    }
}
