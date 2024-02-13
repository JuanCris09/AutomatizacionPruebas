package org.example.pageobjects;

import org.example.enums.Gender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SignUpServices {
    @Autowired
    private SignUpPageObject signUpPageObject;
    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url){ driver.get(url);
    }
    public void writeFirstName(String firstname){
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPageObject.getFirstNameTextbox()));
        this.signUpPageObject.getFirstNameTextbox().sendKeys(firstname);
    }
    public void writeLastName(String lastname){
        this.signUpPageObject.getLastNameTextbox().sendKeys(lastname);
    }
    public void writeEmail(String email){
        this.signUpPageObject.getEmailTextbox().sendKeys(email);
    }
    public void writePhone(String phone){
        this.signUpPageObject.getPhoneTextbox().sendKeys(phone);
    }
    private void selectMale(){
        this.signUpPageObject.getGenderMale().click();
    }
    private void selectFeMale() {
        this.signUpPageObject.getGenderFemale().click();
    }
    public void selectYearBirth(String year){
        new Select(this.signUpPageObject.getYearBirth()).selectByValue(year);
    }
    public void selectCountry(String country) {
        new Select(this.signUpPageObject.getSelectCountry()).selectByValue(country);
    }
    public void writePassword(String password){
        this.signUpPageObject.getPasswordTextbox().sendKeys(password);
    }
    public void writeSecondPass(String password2){
        this.signUpPageObject.getConfirmPasswordTextbox().sendKeys(password2);
    }
    public void clickOnSubmit(){
        this.signUpPageObject.getSubmitBtn().click();
    }

    public void selectGender(Gender gender){
        if(gender == Gender.female){
            selectFeMale();
        }else {
            selectMale();
        }
    }
}
