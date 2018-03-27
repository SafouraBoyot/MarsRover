public class Reporter {
    private final StringFormatter formatter;
    private final OutPutInterface output;

    public Reporter(StringFormatter formatter, OutPutInterface output) {
        this.formatter = formatter;
        this.output = output;
    }

    public void print(Rover rover) {
        String formattedPosition = formatter.format(rover.position());
        output.print(formattedPosition);
    }
}
