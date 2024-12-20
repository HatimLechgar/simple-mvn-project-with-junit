package com.hle;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

public class PersonCollectionTest {

        @Test
        public void testPersonCollection() {

                // Création de personnes avec le builder
                Person jeanPerson = new Person();
                jeanPerson.setFirstName("Jean");
                jeanPerson.setFamilyName("Dupont");
                jeanPerson.setBirthDate(LocalDate.of(1985, 5, 15));

                Person alicePerson = new Person();
                alicePerson.setFirstName("Alice");
                alicePerson.setFamilyName("Durand");
                alicePerson.setBirthDate(LocalDate.of(1990, 10, 20));

                Person bobPerson = new Person();
                bobPerson.setFirstName("Bob");
                bobPerson.setFamilyName("Martin");
                bobPerson.setBirthDate(LocalDate.of(2000, 3, 5));

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
