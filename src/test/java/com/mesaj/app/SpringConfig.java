package com.mesaj.app;

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
        return new ChromeDriver();
    }
}



