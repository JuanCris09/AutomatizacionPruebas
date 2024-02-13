package org.example.util.driver;

import org.example.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static String pathFormat = System.getProperty("user.dir")+"/src/test/resources/drivers/%s";
    public static WebDriver get(Browser browser){
        if(Browser.chrome ==browser){
            System.setProperty("webdriver.chrome.driver", String.format(pathFormat,"chromedriver.exe"));
                    ;
            return new ChromeDriver();
        }
        if(Browser.firefox ==browser){
            System.setProperty("webdriver.gecko.driver",String.format(pathFormat,"geckodriver.exe"));
            return new FirefoxDriver();
        }
        throw new IllegalArgumentException("Driver not founf for browser:"+ browser);
    }
}
