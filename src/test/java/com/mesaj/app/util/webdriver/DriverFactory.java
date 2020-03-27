package com.mesaj.app.util.webdriver;

import com.mesaj.app.util.webdriver.path.GetCompleteDriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver get(Browser browser) {

        if (browser == Browser.chrome) {
            System.setProperty("webdriver.chrome.driver", GetCompleteDriverPath.byBrowser(browser));

            return new ChromeDriver();
        }

        if (browser == Browser.firefox) {
            System.setProperty("webdriver.gecko.driver", GetCompleteDriverPath.byBrowser(browser));
            return new FirefoxDriver();
        }

        throw new IllegalArgumentException("Driver not found for browser: " + browser);
    }
}
