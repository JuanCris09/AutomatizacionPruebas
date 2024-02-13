package org.example.models;

import lombok.Builder;
import lombok.Data;
import org.example.enums.Gender;

@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Gender gender;
    private String birthYear;
    private String password;
    private String passwordConfirmation;

}
