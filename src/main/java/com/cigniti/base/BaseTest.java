package com.cigniti.base;

import com.cigniti.WebDriverInitializer.InitializeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
        if(driver==null){
            driver = InitializeDriver.getDriver();
        }
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }

    @AfterTest
    public void tearDown(){
       driver.close();
       driver.quit();
    }
}
