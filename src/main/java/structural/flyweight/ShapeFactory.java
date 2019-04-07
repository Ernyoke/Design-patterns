package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String shapeType) {
        return shapes.compute(shapeType, (key, value) -> {
            Shape shape;
            if (value == null) {
                shape = createShape(shapeType);
            } else {
                shape = value;
            }
            return shape;
        });
    }

    private static Shape createShape(String shapeType) {
        if (shapeType.equals("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equals("circle")) {
            return new Circle();
        }
        return null;
    }
}
