package com.cigniti.pageobjects;

import com.cigniti.base.BaseTest;
import dev.failsafe.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BaseTest {
    By signinHeaderText = By.xpath("//h1[text()='Sign in']");
    By userNameTextBox = By.xpath("//input[@type='text'][@placeholder='Username']");
    By passwordTextBox = By.name("inputPassword");
    By signInButton = By.xpath("// button[@type='submit']");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public LoginPage(){
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver,this);
    }

    public void verifySignInHeaderText(){
        wait.until(ExpectedConditions.presenceOfElementLocated(signinHeaderText));
        String signInHeaderText = driver.findElement(signinHeaderText).getText();
        Assert.assertEquals("Sign in",signInHeaderText);
    }

    public void login(String userName,String passsword){
        wait.until(ExpectedConditions.presenceOfElementLocated(userNameTextBox));
        driver.findElement(userNameTextBox).sendKeys(userName);
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordTextBox));
        driver.findElement(passwordTextBox).sendKeys(passsword);
        wait.until(ExpectedConditions.presenceOfElementLocated(signInButton));
        driver.findElement(signInButton).click();
    }

}
