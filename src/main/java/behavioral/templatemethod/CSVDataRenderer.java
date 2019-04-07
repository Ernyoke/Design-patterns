package behavioral.templatemethod;

public class CSVDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "Read CSV data.";
    }

    @Override
    public String processData() {
        return "Process CSV data.";
    }
}
