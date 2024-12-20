package com.hle;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String firstName;
    private String familyName;
    private LocalDate birthDate;
    private String adress;


    public int calculateAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
