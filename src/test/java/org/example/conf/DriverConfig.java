package org.example.conf;

import org.example.enums.Browser;
import org.example.util.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:/application-${environment:dev}.properties")
public class DriverConfig {
    @Value("${driver.type}")
    private Browser driverType;
    @Value("${element.wait.timeout.seconds}")

    private int webDriverWaitTimeOut;

    @Bean
    public WebDriver webDriver(){
        return DriverFactory.get(driverType);
    }

    @Bean
    public WebDriverWait waitFor(){
        return new WebDriverWait(webDriver(),Duration.ofSeconds(webDriverWaitTimeOut));
    }
}
