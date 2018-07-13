package creational.prototype;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RegistryTests {
    private Registry registry;

    @BeforeAll
    public void setUp() {
        registry = new Registry();
    }

    @Test
    @DisplayName("Should clone a Movie instance.")
    public void shouldCloneMovie() {
        Movie movie = (Movie)registry.createItem(Movie.class);

        Assertions.assertThat(movie).isNotNull();
        Assertions.assertThat(movie.getTitle()).isEqualTo("Silence of the lambdas");
        Assertions.assertThat(movie.getDuration()).isEqualTo(240);
        Assertions.assertThat(movie.getPrice()).isEqualTo(20);
        Assertions.assertThat(movie.getUrl()).isEqualTo("http://url.movie");
    }

    @Test
    @DisplayName("Should clone a Book instance.")
    public void shouldCloneBook() {
        Book book = (Book)registry.createItem(Book.class);

        Assertions.assertThat(book).isNotNull();
        Assertions.assertThat(book.getTitle()).isEqualTo("Assertive Java");
        Assertions.assertThat(book.getPrice()).isEqualTo(156);
        Assertions.assertThat(book.getUrl()).isEqualTo("http://url.book");
    }
}
