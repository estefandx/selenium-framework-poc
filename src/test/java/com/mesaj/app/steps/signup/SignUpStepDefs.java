package com.mesaj.app.steps.signup;

import com.mesaj.app.DriverConfig;
import com.mesaj.app.pageobjects.signup.SignUpPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = DriverConfig.class)
public class SignUpStepDefs {

    @Autowired
    SignUpPage signUpPage;

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {
        signUpPage.go();
        signUpPage.writeFirstName("pepito");
        signUpPage.writeLastName("perez");
        Thread.sleep(3000);
    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }
}
