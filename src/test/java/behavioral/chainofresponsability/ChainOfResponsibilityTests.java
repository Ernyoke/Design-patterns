package behavioral.chainofresponsability;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChainOfResponsibilityTests {
    private Director director;
    private VP vp;
    private CEO ceo;

    @BeforeAll
    public void setUp() {
        director = new Director();
        vp = new VP();
        ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);
    }

    @Test
    @DisplayName("Should test the chain.")
    public void testChain() {
        director.handleRequest(new Request(150));
        director.handleRequest(new Request(590));
        director.handleRequest(new Request(5966));
    }
}
