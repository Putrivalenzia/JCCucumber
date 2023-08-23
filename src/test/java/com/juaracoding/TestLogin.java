package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User access url HRM")
    public void user_access_url_hrm(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        extentTest.log(LogStatus.PASS, "User enter url HRM");
    }

    @When("User enter valid username")
    public void user_enter_valid_username(){
        loginPage.enterUsername("Admin");
        extentTest.log(LogStatus.PASS, "User enter valid username");

    }

    @And("User enter valid password")
    public void user_enter_valid_password(){
        loginPage.enterPassword("admin123");
        extentTest.log(LogStatus.PASS, "User enter valid password");

    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");


    }


    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "User get text title page dashboard");
        loginPage.logout();
    }

    @When("User enter invalid username")
    public void user_enter_invalid_username(){
        loginPage.enterUsername("adm");
        extentTest.log(LogStatus.PASS, "User enter valid username");

    }

    @When("User emptying username")
    public void user_emptying_username(){
        loginPage.enterUsername("");
        extentTest.log(LogStatus.PASS, "User emptying username");

    }

    @When("User emptying password")
    public void user_emptying_password(){
        loginPage.enterPassword("");
        extentTest.log(LogStatus.PASS, "User emptying password");

    }

    @Then("User get text invalid credentials")
    public void user_get_text_invalid_credentials(){
        Assert.assertEquals(loginPage.getTxtInvalidCredential(), "Invalid credentials");
        extentTest.log(LogStatus.PASS, "User get text invalid credentials");

    }

    @Then("User get text username required")
    public void user_get_text_username_required(){
        Assert.assertEquals(loginPage.getTxtUsernameRequired(), "Required");
        extentTest.log(LogStatus.PASS, "User get text invalid credentials");

    }

    @Then("User get text password required")
    public void user_get_text_password_required(){
        Assert.assertEquals(loginPage.getTxtPasswordRequired(), "Require");
        extentTest.log(LogStatus.PASS, "User get text invalid credentials");

    }




}
