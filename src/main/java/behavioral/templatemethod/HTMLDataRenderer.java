package behavioral.templatemethod;

public class HTMLDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "Read HTML data.";
    }

    @Override
    public String processData() {
        return "Process HTML data.";
    }
}
