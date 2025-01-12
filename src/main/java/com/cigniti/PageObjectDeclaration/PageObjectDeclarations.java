package com.cigniti.PageObjectDeclaration;

import com.cigniti.base.BaseTest;
import com.cigniti.pageobjects.HomePage;
import com.cigniti.pageobjects.LoginPage;

public class PageObjectDeclarations extends BaseTest {
    public static final LoginPage loginPage = new LoginPage();
    public static final HomePage homePage = new HomePage();
}
