package behavioral.templatemethod;

public abstract class DataRenderer {
    public String render() {
        return "Render data.";
    }

    public abstract String readData();
    public abstract String processData();
}
