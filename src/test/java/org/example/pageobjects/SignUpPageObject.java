package org.example.pageobjects;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SignUpPageObject extends PageBase{


    @Autowired
    public SignUpPageObject(WebDriver driver){

        super(driver);
    }


    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement LastNameTextbox;
    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private WebElement emailTextbox;
    @FindBy(xpath = "//input[@ng-model='Phone']")
    private WebElement phoneTextbox;
    @FindBy(xpath = "//input[@value='Male']")
    private WebElement GenderMale;
    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement GenderFemale;
    @FindBy(id = "yearbox")
    private WebElement YearBirth;
    @FindBy(xpath = "//span[@role='combobox']")
    private WebElement SelectCountry;
    @FindBy(id = "firstpassword")
    private WebElement passwordTextbox;
    @FindBy(id = "secondpassword")
    private WebElement ConfirmPasswordTextbox;
    @FindBy(id = "submitbtn")
    private WebElement submitBtn;


}
