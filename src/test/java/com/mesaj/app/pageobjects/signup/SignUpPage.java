package com.mesaj.app.pageobjects.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpPage {

    @Autowired
    protected WebDriver webDriver;

    private By firstNameBy = By.xpath("//input[@ng-model='FirstName']");
    private By lastNameBy = By.xpath("//input[@ng-model='LastName']");
    private By emailAddressBy = By.xpath("//input[@type='email']");
    private By phoneBy = By.xpath("//input[@type='tel']");
    private By genderMaleBy = By.xpath("//input[@value='Male']");
    private By genderFemaleBy = By.xpath("//input[@value='FeMale']");
    private By countryBy = By.id("countries");
    private By dateOfBirthYearBy = By.id("yearbox");
    private By dateOfBirthMonthBy = By.xpath("//select[@ng-model='monthbox']");
    private By dateOfBirthDayBy = By.id("daybox");
    private By passwordBy = By.id("firstpassword");
    private By confirmPasswordBy = By.id("secondpassword");
    private By submitBy = By.id("submitbtn");


    //todo introduce page factory / use the decorators

    public void go() {
        webDriver.get("http://demo.automationtesting.in/Register.html");
    }

    public void writeFirstName(String firstName) {
        webDriver
                .findElement(firstNameBy)
                .sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        webDriver
                .findElement(lastNameBy)
                .sendKeys(lastName);
    }

    public void writeEmailAddress(String emailAddress) {
        webDriver
                .findElement(emailAddressBy)
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
        new Select(webDriver.findElement(countryBy))
                .selectByValue(country);
    }


    public void selectYearOfBirth(String year) {
        new Select(webDriver.findElement(dateOfBirthYearBy))
                .selectByValue(year);
    }

    public void selectMonthOfBirth(String month) {
        new Select(webDriver.findElement(dateOfBirthMonthBy))
                .selectByValue(month);
    }

    public void selectDayOfBirth(String day) {
        new Select(webDriver.findElement(dateOfBirthDayBy))
                .selectByValue(day);
    }

    public void writePassword(String password) {
        webDriver
                .findElement(passwordBy)
                .sendKeys(password);
    }

    public void writePasswordConfirmation(String password) {
        webDriver
                .findElement(confirmPasswordBy)
                .sendKeys(password);
    }

    public void writePhoneNumber(String phoneNumber) {
        webDriver
                .findElement(phoneBy)
                .sendKeys(phoneNumber);
    }

    public void clickOnSubmit() {
        webDriver.findElement(submitBy).click();
    }

    private void selectFemaleGender() {
        webDriver.findElement(genderFemaleBy).click();
    }

    private void selectMaleGender() {
        webDriver.findElement(genderMaleBy).click();
    }

    public enum Gender {
        female,
        male
    }

}


