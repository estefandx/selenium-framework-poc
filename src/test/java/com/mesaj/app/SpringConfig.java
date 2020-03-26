package com.mesaj.app;

import com.mesaj.app.util.webdriver.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mesaj.app")
public class SpringConfig {

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", DriverUtil
                .getPathDriverByOS());
        return new ChromeDriver();
    }
}



