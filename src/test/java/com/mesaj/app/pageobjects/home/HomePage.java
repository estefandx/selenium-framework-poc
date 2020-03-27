package com.mesaj.app.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    @Autowired
    protected WebDriver webDriver;

    @Autowired
    protected WebDriverWait webDriverWait;

    private By tablePaginationBy = By.xpath("//div[@role='contentinfo']");

    public void paginationShouldBeVisible() {
        webDriverWait
                .until(ExpectedConditions.visibilityOf(webDriver.findElement(tablePaginationBy)));
    }
}
