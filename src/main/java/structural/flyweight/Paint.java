package structural.flyweight;

import java.util.stream.IntStream;

public class Paint {
    public void render(int numberOfShapes) {
        IntStream.iterate(0, i -> i < numberOfShapes, i -> i + 1).forEach(i -> {
            if (i % 2 == 0) {
                ShapeFactory.getShape("circle").draw(5, "red", "black");
            } else {
                ShapeFactory.getShape("rectangle").draw(5, 5, "dotted");
            }
        });
    }
}
