package com.mesaj.app;

import com.mesaj.app.util.webdriver.DriverFactory;
import com.mesaj.app.util.webdriver.Browser;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.mesaj.app")
@PropertySource("classpath:/application.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Bean
    public WebDriver webDriver() {
        return DriverFactory.get(driverType);
    }
}



