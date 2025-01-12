package com.cigniti.WebDriverInitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }
}

