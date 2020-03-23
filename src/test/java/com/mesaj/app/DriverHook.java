package com.mesaj.app;


import com.mesaj.app.util.webdriver.DriverUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHook {

    public static WebDriver driver;

    @Before
    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver", DriverUtil
                .getPathDriverByOS());
        driver = new ChromeDriver();
    }

    @After
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
