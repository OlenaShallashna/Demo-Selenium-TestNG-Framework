package com.orangeHrm.tests;

import com.orangeHrm.base.TestBase;
import com.orangeHrm.pages.HomePage;
import com.orangeHrm.pages.LoginPage;
import com.orangeHrm.testData.DataProviders;
import com.orangeHrm.testData.ExpectedMessages;
import com.orangeHrm.utilities.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends TestBase {

    @Test
    public void testLoginWithValidCredentials(){
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.login(PropertiesUtils.getUsername(), PropertiesUtils.getPassword()); // TODO - remove the hardcoded values
        HomePage homePage = new HomePage(driver.get());
        String actualMessage = homePage.getWelcomeMessageText();
        Assert.assertEquals(actualMessage, ExpectedMessages.WELCOME_MESSAGE, "The login verification failed.");
    }


    @Test(dataProviderClass = DataProviders.class, dataProvider = "Login Invalid Credentials")
    public void testLoginWithInvalidCredentials(String username, String password, String expectedErrorMessage){
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.login(username, password);
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "The error message verification failed!");
    }



}
