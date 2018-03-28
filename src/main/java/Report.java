public class Report {
    private final OutputInterface output;

    public Report(OutputInterface output) {
        this.output = output;
    }

    public void print(Rover rover) {
        output.print(rover.position().toString());
    }
}
