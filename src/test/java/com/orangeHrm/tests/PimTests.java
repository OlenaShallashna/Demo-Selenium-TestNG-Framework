package com.orangeHrm.tests;

import com.orangeHrm.base.TestBase;
import com.orangeHrm.pages.HomePage;
import com.orangeHrm.pages.LoginPage;
import com.orangeHrm.pages.PimPage;
import com.orangeHrm.testData.ExpectedMessages;
import com.orangeHrm.utilities.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PimTests extends TestBase {

    @Test
    public void verifyPimPageHeader(){
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.login(PropertiesUtils.getUsername(), PropertiesUtils.getPassword()); // TODO - remove the hardcoded values
        HomePage homePage = new HomePage(driver.get());
        homePage.clickPimTab();
        PimPage pimPage = new PimPage(driver.get());
        Assert.assertEquals(pimPage.getHeaderText(), ExpectedMessages.PIM_HEADER, "Pim header verification failed.");
    }

}
