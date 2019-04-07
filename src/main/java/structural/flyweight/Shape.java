package structural.flyweight;

public abstract class Shape {
    protected String label;

    public Shape(String label) {
        this.label = label;
    }

    public void draw(int radius, String fillColor, String lineColor) {
        // nothing to do here
    }

    public void draw(int length, int width, String fillStyle) {
        // nothing to do here
    }
}
