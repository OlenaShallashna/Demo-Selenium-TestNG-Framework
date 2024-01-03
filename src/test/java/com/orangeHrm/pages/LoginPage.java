package com.orangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    private WebElement usernameInputBox;
    @FindBy(id = "txtPassword")
    private WebElement passwordInputBox;
    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @FindBy(id = "spanMessage")
    private WebElement errorMessage;

    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

}
