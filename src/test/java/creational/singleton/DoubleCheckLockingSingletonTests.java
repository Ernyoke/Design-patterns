package creational.singleton;

import creational.sigleton.DoubleCheckLockingSingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleCheckLockingSingletonTests {
    @Test
    @DisplayName("Should return the same reference for multiple instantiations.")
    public void shouldReturnSameReference() {
        DoubleCheckLockingSingleton lazySingleton1 = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton lazySingleton2 = DoubleCheckLockingSingleton.getInstance();
        assertThat(lazySingleton1 == lazySingleton2).isTrue();
    }
}
