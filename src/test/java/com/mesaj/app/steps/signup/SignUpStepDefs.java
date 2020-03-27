package com.mesaj.app.steps.signup;

import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.enums.Gender;
import com.mesaj.app.pageobjects.home.HomePage;
import com.mesaj.app.pageobjects.signup.SignUpServices;
import com.mesaj.app.util.RandomNumberGenerator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

//@ContextConfiguration(classes = DriverConfig.class)
@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    @Autowired
    SignUpServices signUpServices;

    @Autowired
    HomePage homePage;

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {

        String randomNumber = RandomNumberGenerator.get();

        signUpServices.go();
        signUpServices.writeFirstName("pepito");
        signUpServices.writeLastName("perez");
        signUpServices.writeEmailAddress(String.format("%s%s%s", "perez@", randomNumber, ".com"));
        signUpServices.writePhoneNumber(RandomNumberGenerator.get());
        signUpServices.selectGender(Gender.male);
        signUpServices.selectCountry("Colombia");
        signUpServices.selectYearOfBirth("1917");
        signUpServices.selectMonthOfBirth("January");
        signUpServices.selectDayOfBirth("1");
        signUpServices.writePassword("Passw0rdXX.._");
        signUpServices.writePasswordConfirmation("Passw0rdXX.._");
        signUpServices.clickOnSubmit();

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {
        homePage.paginationShouldBeVisible();
    }
}
