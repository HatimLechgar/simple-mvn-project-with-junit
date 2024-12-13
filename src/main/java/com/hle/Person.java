package com.hle;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public int calculateAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
