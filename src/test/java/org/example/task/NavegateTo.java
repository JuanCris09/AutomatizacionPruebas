package org.example.task;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NavegateTo {
    @Autowired
    private WebDriver webDriver;

    @Value("${url}")
    private String url;

    public void signUpPage(){
        this.webDriver.get(url);
    }
}
