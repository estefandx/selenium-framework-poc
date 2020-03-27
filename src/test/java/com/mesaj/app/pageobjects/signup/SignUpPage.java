package com.mesaj.app.pageobjects.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpPage {

    private WebDriver webDriver;

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement genderFemale;

    @FindBy(id = "countries")
    private WebElement country;

    @FindBy(id = "yearbox")
    private WebElement dateOfBirthYear;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement dateOfBirthMonth;

    @FindBy(id = "daybox")
    private WebElement dateOfBirth;

    @FindBy(id = "firstpassword")
    private WebElement password;

    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;

    @FindBy(id = "submitbtn")
    private WebElement submit;

    @Autowired
    public SignUpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void go() {
        webDriver.get("http://demo.automationtesting.in/Register.html");
    }

    public void writeFirstName(String firstName) {
        this.firstName
                .sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        this.lastName
                .sendKeys(lastName);
    }

    public void writeEmailAddress(String emailAddress) {
        this.emailAddress
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
        new Select(this.country)
                .selectByValue(country);
    }


    public void selectYearOfBirth(String year) {
        new Select(this.dateOfBirthYear)
                .selectByValue(year);
    }

    public void selectMonthOfBirth(String month) {
        new Select(this.dateOfBirthMonth)
                .selectByValue(month);
    }

    public void selectDayOfBirth(String day) {
        new Select(this.dateOfBirth)
                .selectByValue(day);
    }

    public void writePassword(String password) {
        this.password
                .sendKeys(password);
    }

    public void writePasswordConfirmation(String password) {
        this.confirmPassword
                .sendKeys(password);
    }

    public void writePhoneNumber(String phoneNumber) {
        this.phone
                .sendKeys(phoneNumber);
    }

    public void clickOnSubmit() {
        submit.click();
    }

    private void selectFemaleGender() {
        this.genderFemale.click();
    }

    private void selectMaleGender() {
        this.genderMale.click();
    }

    public enum Gender {
        female,
        male
    }
}