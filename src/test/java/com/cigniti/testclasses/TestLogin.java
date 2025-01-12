package com.cigniti.testclasses;

import com.cigniti.PageObjectDeclaration.PageObjectDeclarations;
import com.cigniti.base.BaseTest;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    @Test
    public void testLogin() {
        PageObjectDeclarations.loginPage.verifySignInHeaderText();
        PageObjectDeclarations.loginPage.login("Manish", "rahulshettyacademy");
        PageObjectDeclarations.homePage.verifyHomePage();
    }

    @Test
    public void testLogout() {
        PageObjectDeclarations.homePage.verifyHomePage();
        PageObjectDeclarations.homePage.logout();
        PageObjectDeclarations.loginPage.verifySignInHeaderText();
    }
}

