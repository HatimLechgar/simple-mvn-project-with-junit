package com.hle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PersonConstructorAndSetterAndGetterTest {

    @Test
    public void testPersonConstructor() {

        Person jamalPerson = new Person();
        jamalPerson.setFirstName("Hatim");
        jamalPerson.setFamilyName("Lechgar");

        //assertNotNull(jamalPerson);
        assertThat(jamalPerson).isNotNull();

        // assertEquals("Jamal", jamalPerson.getFirstName());
        assertThat(jamalPerson.getFirstName()).isEqualTo("Hatim");

        //assertEquals("Jamali", jamalPerson.getLastName());
        assertThat(jamalPerson.getFamilyName()).isEqualTo("Lechgar");


  


    }

}
