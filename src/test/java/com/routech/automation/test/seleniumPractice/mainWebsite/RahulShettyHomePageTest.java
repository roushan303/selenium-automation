package com.routech.automation.test.seleniumPractice.mainWebsite;

import com.routech.automation.seleniumPractice.mainWebsite.RahulShettyMainPage;
import com.routech.automation.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulShettyHomePageTest extends BaseTest {

    private RahulShettyMainPage rahulShettyMainPage;

    @BeforeTest
    public void setupPages(){
        rahulShettyMainPage = new RahulShettyMainPage(driver);
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openRahulShettyHomePage(){
        rahulShettyMainPage.goTo();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickOnLoginButton(){
        rahulShettyMainPage.getRahulShettyHomePage().clickLoginButton();
        rahulShettyMainPage.navigateBack();
        rahulShettyMainPage.getRahulShettyHomePage().isDisplayed();
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickOnRegisterButton(){
        rahulShettyMainPage.getRahulShettyHomePage().clickRegisterButton();
        rahulShettyMainPage.navigateBack();
    }


}
