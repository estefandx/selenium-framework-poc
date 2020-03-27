package com.mesaj.app.pageobjects.home;

import com.mesaj.app.pageobjects.base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends PageBase {

    @Autowired
    protected WebDriverWait webDriverWait;

    private By tablePaginationBy = By.xpath("//div[@role='contentinfo']");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void paginationShouldBeVisible() {
        webDriverWait
                .until(ExpectedConditions.visibilityOf(webDriver.findElement(tablePaginationBy)));
    }
}
