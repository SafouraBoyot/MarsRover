public class Reporter {

    private final OutPutInterface output;

    public Reporter( OutPutInterface output) {
        this.output = output;
    }

    public void print(Rover rover) {
        output.print(rover.position().toString());
    }
}
