package creational.singleton;

import creational.sigleton.LazySingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LazySingletonTests {

    @Test
    @DisplayName("Should return the same reference for multiple instantiations.")
    public void shouldReturnSameReference() {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        assertThat(lazySingleton1 == lazySingleton2).isTrue();
    }
}
