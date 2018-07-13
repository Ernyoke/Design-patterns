package creational.factory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapeFactoryTests {
    private ShapeFactory shapeFactory;

    @BeforeAll
    public void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    @DisplayName("Should return a Circle.")
    public void shouldReturnCircle() throws Exception {
        Shape shape = shapeFactory.getShape(ShapeFactory.Type.CIRCLE);

        Assertions.assertThat(shape).isNotNull();
        Assertions.assertThat(shape instanceof Circle).isTrue();
    }

    @Test
    @DisplayName("Should return a Triangle.")
    public void shouldReturnTriangle() throws Exception {
        Shape shape = shapeFactory.getShape(ShapeFactory.Type.TRIANGLE);

        Assertions.assertThat(shape).isNotNull();
        Assertions.assertThat(shape instanceof Triangle).isTrue();
    }

    @Test
    @DisplayName("Should return a Rectangle.")
    public void shouldReturnRectangle() throws Exception {
        Shape shape = shapeFactory.getShape(ShapeFactory.Type.RECTANGLE);

        Assertions.assertThat(shape).isNotNull();
        Assertions.assertThat(shape instanceof Rectangle).isTrue();
    }
}
