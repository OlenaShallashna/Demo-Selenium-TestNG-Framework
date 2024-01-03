package com.orangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    public PimPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".head")
    private WebElement pageHeader;

    public String getHeaderText(){
        return pageHeader.getText();
    }

}
