package com.mesaj.app.pageobjects.signup;

import com.mesaj.app.DriverHook;
import org.openqa.selenium.By;

public class SignUpPage {

    private By firstNameBy = By.xpath("//input[@ng-model='FirstName']");
    private By lastNameBy = By.xpath("//input[@ng-model='LastName']");

    public SignUpPage() {

    }

    public void go() {
        DriverHook.driver.get("http://demo.automationtesting.in/Register.html");
    }

    public void writeFirstName(String firstName) {
        DriverHook.driver
                .findElement(firstNameBy)
                .sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        DriverHook.driver
                .findElement(lastNameBy)
                .sendKeys(lastName);
    }

}
