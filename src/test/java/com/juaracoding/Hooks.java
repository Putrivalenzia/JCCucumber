package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.TestCases;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before //akan eksekusi setiap test case
    public void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        TestCases[] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

//    @AfterStep
//    public void getResultStatus(){
//
//    }

    @After
    public void endTestCase(){
        reports.endTest(extentTest);//hasil eksekusi scenario akan di generate reportnya
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }


}
