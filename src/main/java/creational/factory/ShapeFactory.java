package creational.factory;

public class ShapeFactory {
    public enum Type {
        CIRCLE, TRIANGLE, RECTANGLE
    }

    public Shape getShape(Type type) throws Exception {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new Exception("Invalid form!");
        }
    }
}
