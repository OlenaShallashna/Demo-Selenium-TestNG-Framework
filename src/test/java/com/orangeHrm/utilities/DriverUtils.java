package com.orangeHrm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverUtils {

    public static WebDriver getDriver(String browserType){
        return switch (browserType) {
            case "firefox" -> new FirefoxDriver();
            case "safari" -> new SafariDriver();
            default -> new ChromeDriver();
        };
    }
}
