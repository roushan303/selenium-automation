package com.routech.automation.test.seleniumPractice.mainWebsite;

import com.routech.automation.seleniumPractice.mainWebsite.RahulShettyMainPage;
import com.routech.automation.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulShettyHomePageTest extends BaseTest {

    private RahulShettyMainPage rahulShettyMainPage;

    @BeforeTest
    public void setupPages(){
        this.rahulShettyMainPage = new RahulShettyMainPage(getDriver());
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openRahulShettyHomePage(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyMainPage.goTo();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickOnLoginButtonForRahulHomePage(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyMainPage.getRahulShettyHomePage().isDisplayed();
        rahulShettyMainPage.getRahulShettyHomePage().clickLoginButton(getDriver());
        rahulShettyMainPage.navigateBack();
        rahulShettyMainPage.getRahulShettyHomePage().isDisplayed();
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickOnRegisterButton(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyMainPage.getRahulShettyHomePage().clickRegisterButton(getDriver());
        rahulShettyMainPage.navigateBack();
    }


}
