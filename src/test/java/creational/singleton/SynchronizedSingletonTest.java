package creational.singleton;

import creational.sigleton.SynchronizedSingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SynchronizedSingletonTest {
    @Test
    @DisplayName("Should return the same reference for multiple instantiations.")
    public void shouldReturnSameReference() {
        SynchronizedSingleton lazySingleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton lazySingleton2 = SynchronizedSingleton.getInstance();
        assertThat(lazySingleton1 == lazySingleton2).isTrue();
    }
}
