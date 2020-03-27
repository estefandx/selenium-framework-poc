package com.mesaj.app.pageobjects.signup;

import com.mesaj.app.pageobjects.base.PageBase;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SignUpPage extends PageBase {

    @Getter
    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstName;

    @Getter
    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;

    @Getter
    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddress;

    @Getter
    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;

    @Getter
    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @Getter
    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement genderFemale;

    @Getter
    @FindBy(id = "countries")
    private WebElement country;

    @Getter
    @FindBy(id = "yearbox")
    private WebElement dateOfBirthYear;

    @Getter
    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement dateOfBirthMonth;

    @Getter
    @FindBy(id = "daybox")
    private WebElement dateOfBirthDay;

    @Getter
    @FindBy(id = "firstpassword")
    private WebElement password;

    @Getter
    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;

    @Getter
    @FindBy(id = "submitbtn")
    private WebElement submit;

    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
    }
}