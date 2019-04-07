package structural.flyweight;

public class Circle extends Shape {
    public Circle() {
        super("Circle");
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a " + label + " with radius of " + radius + ", fill color of " + fillColor + " and line color of " + lineColor + ".");
    }
}
