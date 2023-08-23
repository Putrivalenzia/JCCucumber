package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestRecruitment {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    static RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User click recruitment menu")
    public void user_click_recruitment_menu(){
        loginPage.login("Admin", "admin123");
        recruitmentPage.clickRecruitmentMenu();
        extentTest.log(LogStatus.PASS, "User click recruitment menu");
    }
    @And("User click vacancies tab")
    public void user_click_vacancies_tab(){
        recruitmentPage.clickTabVacancies();
        extentTest.log(LogStatus.PASS, "User click vacancies tab");
    }
    @And("User click button add")
    public void user_click_button_add(){
        recruitmentPage.clickButtonAdd();
        extentTest.log(LogStatus.PASS, "User click button add");
    }
    @And("User input Vacancy Name")
    public void user_input_vacancy_name(){
        recruitmentPage.inputVancanciesName("Software Engineer");
        extentTest.log(LogStatus.PASS, "User input Vacancy Name");
    }
    @And("User input Job Title")
    public void user_input_job_title(){
        recruitmentPage.inputJobTitle("Software Engineer");
        extentTest.log(LogStatus.PASS, "User input Job Title");
    }
    @And("User input Hiring Manager")
    public void user_input_hiring_manager(){
        recruitmentPage.inputHiringManager("Kevin Mathews");
        DriverSingleton.delay(5);
        recruitmentPage.inputHiringManager(""+ Keys.ARROW_DOWN+Keys.ENTER);
        extentTest.log(LogStatus.PASS, "User input Hiring Manager");
    }
    @And("User click button save")
    public void user_click_button_save(){
        recruitmentPage.clickButtonSave();
        extentTest.log(LogStatus.PASS, "User click button save");
    }

}
