package org.example.builder.data;

import org.example.enums.Gender;
import org.example.models.User;
import org.example.util.RandomNumberGenerator;

public class UserBuilder {
    private User user;

    private UserBuilder(){
        user = User.builder().build();
    }

    public static UserBuilder anUser(){
        return new UserBuilder();
    }
    public UserBuilder but(){
        return withDefaultInfo();
    }
    public UserBuilder withDefaultInfo(){
        this.user = User.builder()
                .firstName("Pepito")
                .lastName("Perez")
                .email("perez@gmail.com")
                .gender(Gender.male)
                .phone(RandomNumberGenerator.get())
                .birthYear("19998")
                .password("123456")
                .passwordConfirmation("123456").build();
        return this;
    }

    public UserBuilder WithOutEmail(){
        user.setEmail("");
        return this;
    }
    public UserBuilder WithOutBirthYear(){
        user.setBirthYear("");
        return this;
    }
    public User build(){
        return this.user;
    }
}
