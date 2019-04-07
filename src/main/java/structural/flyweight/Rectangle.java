package structural.flyweight;

public class Rectangle extends Shape {
    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public void draw(int length, int width, String fillStyle) {
        System.out.println("Drawing a " + label + " with length of " + length + ", width of " + width + " and fill style of " + fillStyle + ".");
    }
}
