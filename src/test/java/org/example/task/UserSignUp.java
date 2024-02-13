package org.example.task;

import org.example.enums.Gender;
import org.example.models.User;
import org.example.pageobjects.SignUpServices;
import org.example.util.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {

    @Autowired
    private SignUpServices signUp;

    public void withInfo(User user){
        signUp.writeFirstName(user.getFirstName());
        signUp.writeLastName(user.getLastName());
        signUp.writeEmail(user.getEmail());
        signUp.selectGender(user.getGender());
        signUp.writePhone(RandomNumberGenerator.get());
        signUp.selectYearBirth(user.getBirthYear());
        //signUp.selectCountry("Japan");
        signUp.writePassword(user.getPassword());
        signUp.writeSecondPass(user.getPasswordConfirmation());

        //signUp.clickOnSubmit();
    }
}
