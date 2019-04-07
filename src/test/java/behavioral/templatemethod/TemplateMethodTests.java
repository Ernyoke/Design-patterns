package behavioral.templatemethod;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TemplateMethodTests {
    @Test
    @DisplayName("Should test the template methods!")
    public void testTemplateMethod() {
        DataRenderer xmlDataRenderer = new XMLDataRenderer();
        DataRenderer csvDataRenderer = new CSVDataRenderer();
        DataRenderer htmlDataRenderer = new HTMLDataRenderer();

        Assertions.assertThat(xmlDataRenderer.readData()).isEqualTo("Read XML data.");
        Assertions.assertThat(xmlDataRenderer.processData()).isEqualTo("Process XML data.");
        Assertions.assertThat(xmlDataRenderer.render()).isEqualTo("Render data.");

        Assertions.assertThat(csvDataRenderer.readData()).isEqualTo("Read CSV data.");
        Assertions.assertThat(csvDataRenderer.processData()).isEqualTo("Process CSV data.");
        Assertions.assertThat(xmlDataRenderer.render()).isEqualTo("Render data.");

        Assertions.assertThat(htmlDataRenderer.readData()).isEqualTo("Read HTML data.");
        Assertions.assertThat(htmlDataRenderer.processData()).isEqualTo("Process HTML data.");
        Assertions.assertThat(xmlDataRenderer.render()).isEqualTo("Render data.");
    }
}
