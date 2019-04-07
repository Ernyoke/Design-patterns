package structural.flyweight;

import creational.sigleton.SynchronizedSingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FlyweightTests {
    @Test
    @DisplayName("Should test flyweight pattern.")
    public void shouldReturnSameReference() {
        SynchronizedSingleton lazySingleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton lazySingleton2 = SynchronizedSingleton.getInstance();
        assertThat(lazySingleton1 == lazySingleton2).isTrue();
    }
}
