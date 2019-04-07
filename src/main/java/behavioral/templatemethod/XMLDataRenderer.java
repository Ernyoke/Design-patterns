package behavioral.templatemethod;

public class XMLDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "Read XML data.";
    }

    @Override
    public String processData() {
        return "Process XML data.";
    }
}
