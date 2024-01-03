package com.orangeHrm.base;

import com.orangeHrm.utilities.DriverUtils;
import com.orangeHrm.utilities.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Parameters("browserType")
    @BeforeMethod
    public void setUp(String browserType){
        driver.set(DriverUtils.getDriver(browserType));
        // driver.manage().window().maximize();
        // This line of code will make sure that the element are rendered by waiting for them if needed
        driver.get().get(PropertiesUtils.getBaseUrl());
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown(){
        driver.get().quit();
        driver.remove();
    }

}
