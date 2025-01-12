package com.cigniti.pageobjects;

import com.cigniti.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends BaseTest {
    By youAreSuccessfullyLoggedInText = By.xpath("//p[contains(text(),'You are successfully logged in.')]");
    By logoutButton = By.xpath("//button[text()='Log Out']");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


    public HomePage(){
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(youAreSuccessfullyLoggedInText));
        String retrievedYouAreSuccessfullyLoggedInText = driver.findElement(youAreSuccessfullyLoggedInText).getText();
        Assert.assertEquals("You are successfully logged in.",retrievedYouAreSuccessfullyLoggedInText);
    }

    public void logout(){
        wait.until(ExpectedConditions.presenceOfElementLocated(logoutButton));
        driver.findElement(logoutButton).click();
    }



}
