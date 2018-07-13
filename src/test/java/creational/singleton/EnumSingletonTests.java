package creational.singleton;

import creational.sigleton.EnumSingleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumSingletonTests {
    @Test
    @DisplayName("Should return the same reference for multiple instantiations.")
    public void shouldReturnSameReference() {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        assertThat(enumSingleton1 == enumSingleton2).isTrue();
    }
}
