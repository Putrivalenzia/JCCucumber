package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindBy
    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement username;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement password;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//h6[contains(@class, 'topbar-header-breadcrumb')]")
    WebElement txtDashboard;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    WebElement txtInvalidCredential;

    @FindBy (xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span")
    WebElement txtPasswordRequired;

    @FindBy (xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    WebElement txtUsernameRequired;

    // Custom Method

    public void login (String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
        btnLogin.click();
    }
    public void enterUsername(String username){

        this.username.sendKeys(username);
    }

    public void enterPassword(String password){

        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){

        btnLogin.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    public String getTxtInvalidCredential(){
        return txtInvalidCredential.getText();
    }
    public String getTxtPasswordRequired(){
        return txtPasswordRequired.getText();
    }
    public String getTxtUsernameRequired(){
        return txtUsernameRequired.getText();
    }
}
