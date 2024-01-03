package com.orangeHrm.pages;

import com.orangeHrm.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage{

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "welcome")
    private WebElement welcomeMessage;

    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement pimTab;

    public String getWelcomeMessageText(){
        return welcomeMessage.getText();
    }

    public void clickPimTab(){
        pimTab.click();
    }

}
