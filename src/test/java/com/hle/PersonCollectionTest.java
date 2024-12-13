package com.hle;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonCollectionTest {

        @Test
        public void testPersonCollection() {

                // Création de personnes avec le builder
                Person jeanPerson = Person.builder()
                                .firstName("Jean")
                                .lastName("Dupont")
                                .birthDate(LocalDate.of(1985, 5, 15))
                                .build();

                Person alicePerson = Person.builder()
                                .firstName("Alice")
                                .lastName("Durand")
                                .birthDate(LocalDate.of(1990, 10, 20))
                                .build();

                Person bobPerson = Person.builder()
                                .firstName("Bob")
                                .lastName("Martin")
                                .birthDate(LocalDate.of(2000, 3, 5))
                                .build();

                // Liste de personnes
                List<Person> personnes = List.of(jeanPerson, alicePerson, bobPerson);

                // Vérifications sur la collection
                assertThat(personnes)
                                .hasSize(3) // Vérifie la taille de la collection
                                .extracting(Person::getFirstName) // Extrait les prénoms
                                .contains("Jean", "Alice") // Vérifie que certains prénoms sont présents
                                .doesNotContain("Charlie"); // Vérifie qu'un prénom n'est pas présent

                // Vérifie que tous les âges sont supérieurs à 20 ans
                assertThat(personnes)
                                .allSatisfy(personne -> assertThat(personne.calculateAge()).isGreaterThan(20));

        }

}
