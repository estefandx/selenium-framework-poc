package com.mesaj.app.pageobjects.signup;

import com.mesaj.app.enums.Gender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {

    @Autowired
    private WebDriver webDriver;

    @Autowired
    private SignUpPage signUpPage;

    @Value("${url}")
    private String url;

    public void go() {
        webDriver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.signUpPage.getFirstName()
                .sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        this.signUpPage.getLastName()
                .sendKeys(lastName);
    }

    public void writeEmailAddress(String emailAddress) {
        this.signUpPage.getEmailAddress()
                .sendKeys(emailAddress);
    }

    public void selectGender(Gender gender) {
        if (gender == Gender.male) {
            selectMaleGender();
        } else {
            selectFemaleGender();
        }
    }

    public void selectCountry(String country) {
        new Select(this.signUpPage.getCountry())
                .selectByValue(country);
    }


    public void selectYearOfBirth(String year) {
        new Select(this.signUpPage.getDateOfBirthYear())
                .selectByValue(year);
    }

    public void selectMonthOfBirth(String month) {
        new Select(this.signUpPage.getDateOfBirthMonth())
                .selectByValue(month);
    }

    public void selectDayOfBirth(String day) {
        new Select(this.signUpPage.getDateOfBirthDay())
                .selectByValue(day);
    }

    public void writePassword(String password) {
        this.signUpPage.getPassword()
                .sendKeys(password);
    }

    public void writePasswordConfirmation(String password) {
        this.signUpPage.getConfirmPassword()
                .sendKeys(password);
    }

    public void writePhoneNumber(String phoneNumber) {
        this.signUpPage.getPhone()
                .sendKeys(phoneNumber);
    }

    public void clickOnSubmit() {
        this.signUpPage.getSubmit().click();
    }

    private void selectFemaleGender() {
        this.signUpPage.getGenderFemale().click();
    }

    private void selectMaleGender() {
        this.signUpPage.getGenderMale().click();
    }
}
