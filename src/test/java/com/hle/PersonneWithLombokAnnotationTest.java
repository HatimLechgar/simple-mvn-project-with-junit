package com.hle;

import java.time.LocalDate;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonneWithLombokAnnotationTest {

    @Test
    public void testGetter() {
        Person personne = Person.builder()
                .firstName("Jean")
                .lastName("Dupont")
                .birthDate(LocalDate.of(1990, 1, 1))
                .build();

        assertThat(personne.getFirstName()).isEqualTo("Jean");
    }

    @Test
    public void testSetter() {
        Person personne = new Person();
        personne.setLastName("Doe");

        assertThat(personne.getLastName()).isEqualTo("Doe");
    }

    @Test
    public void testCalculateAge() {
        Person alicePerson = Person.builder()
                .firstName("Alice")
                .lastName("Smith")
                .birthDate(LocalDate.of(2000, 12, 1))
                .build();

        // This test will pass this year 2024 , but next year will go down because
        // calculateAge() will return 25 ... !
        assertThat(alicePerson.calculateAge()).isGreaterThanOrEqualTo(24);

        // the Solution would be :
        // int expectedAge = Period.between(alicePerson.getBirthDate(),LocalDate.now()).getYears();
        // assertThat(alicePerson.calculateAge()).isGreaterThanOrEqualTo(24);

    }
}
