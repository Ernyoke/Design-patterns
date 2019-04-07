package structural.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FlyweightTests {
    @Test
    @DisplayName("Should test flyweight pattern.")
    public void shouldReturnSameReference() {
        Paint paint = new Paint();
        paint.render(10);
    }
}
