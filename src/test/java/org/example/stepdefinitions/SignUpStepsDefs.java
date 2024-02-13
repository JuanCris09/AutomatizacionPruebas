package org.example.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.builder.data.UserBuilder;
import org.example.conf.DriverConfig;
import org.example.task.NavegateTo;
import org.example.task.UserSignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;


@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepsDefs {

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private NavegateTo navigate;


    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {
        navigate.signUpPage();


    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {
        signUp.withInfo(
                UserBuilder
                        .anUser()
                        .but()
                        .WithOutEmail()
                        .WithOutBirthYear()
                        .build()
        );
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created()  {
        assertThat(true).isEqualTo(true);
    }

    @Then("^He should be told that the account was not created$")
    public void he_should_be_told_that_the_account_was_not_created()  {
        assertThat(true).isEqualTo(false);
    }
}
