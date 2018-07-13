package creational.builder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTests {
    @Test
    @DisplayName("Should return a person with every field set.")
    public void shouldReturnPersonWithEveryField() throws ParseException {
        String expectedName = "name";
        String expectedAddress = "address";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date expectedBirthDate = simpleDateFormat.parse("21/12/2012");

        Person person = new Person.Builder().name(expectedName).address(expectedAddress).dateOfBirth(expectedBirthDate).build();

        Assertions.assertThat(person).isNotNull();
        Assertions.assertThat(person.getName()).isEqualTo(expectedName);
        Assertions.assertThat(person.getAddress()).isEqualTo(expectedAddress);
        Assertions.assertThat(person.getDateOfBirth()).isEqualTo(expectedBirthDate);
    }

    @Test
    @DisplayName("Should return a person with no fields set.")
    public void shouldReturnPersonWithNoField() {
        Person person = new Person.Builder().build();

        Assertions.assertThat(person).isNotNull();
        Assertions.assertThat(person.getName()).isNull();
        Assertions.assertThat(person.getAddress()).isNull();
        Assertions.assertThat(person.getDateOfBirth()).isNull();
    }

    @Test
    @DisplayName("Should return a person with only the name fields set.")
    public void shouldReturnPersonWithNameField() {
        String expectedName = "name";

        Person person = new Person.Builder().name(expectedName).build();

        Assertions.assertThat(person).isNotNull();
        Assertions.assertThat(person.getName()).isEqualTo(expectedName);
        Assertions.assertThat(person.getAddress()).isNull();
        Assertions.assertThat(person.getDateOfBirth()).isNull();
    }
}
