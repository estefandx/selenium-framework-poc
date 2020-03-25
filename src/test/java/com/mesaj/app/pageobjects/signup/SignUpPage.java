package com.mesaj.app.pageobjects.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpPage {

    @Autowired
    protected WebDriver webDriver;

    private By firstNameBy = By.xpath("//input[@ng-model='FirstName']");
    private By lastNameBy = By.xpath("//input[@ng-model='LastName']");

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
}
