package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Element @FindBy

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement recruitmentMenu;

    @FindBy(xpath = "//a[normalize-space()='Vacancies']")
    WebElement tabVacancies;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[1]")
    WebElement vacancyName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement jobTitle;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement hiringManager;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    public void clickRecruitmentMenu(){
        recruitmentMenu.click();
    }
    public void clickTabVacancies(){
        tabVacancies.click();
    }
    public void clickButtonAdd(){
        btnAdd.click();
    }
    public void inputVancanciesName(String paramVacancyName){
        vacancyName.sendKeys(paramVacancyName);
    }
    public void inputJobTitle(String paramJobTitle){
        jobTitle.sendKeys(paramJobTitle);
    }
    public void inputHiringManager(String paramHiringManager){
        hiringManager.sendKeys(paramHiringManager);
    }
    public void clickButtonSave(){
        btnSave.click();
    }



}
