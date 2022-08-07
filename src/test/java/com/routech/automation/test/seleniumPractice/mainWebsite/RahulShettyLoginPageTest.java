package com.routech.automation.test.seleniumPractice.mainWebsite;

import com.routech.automation.seleniumPractice.mainWebsite.RahulShettyMainPage;
import com.routech.automation.test.BaseTest;
import com.routech.automation.utils.ConfigLoader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulShettyLoginPageTest extends BaseTest {

    private RahulShettyMainPage rahulShettyMainPage;

    @BeforeTest
    public void setupPages(){
        this.rahulShettyMainPage = new RahulShettyMainPage(driver);
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openRahulShettyLoginPage(){
        rahulShettyMainPage.goTo();
        rahulShettyMainPage.getRahulShettyHomePage().clickLoginButton();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterEmailIdForLoginUser(){
        rahulShettyMainPage.getRahulShettyLoginPage().isDisplayed();
        rahulShettyMainPage.getRahulShettyLoginPage().enterEmailId(ConfigLoader.getInstance().getRahulShettyUserName());
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterWrongPasswordForLoginUser(){
        rahulShettyMainPage.getRahulShettyLoginPage().enterPassword(ConfigLoader.getInstance().getRahulShettyWrongPassword());
    }

    @Test(priority = 4, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickOnLoginButton() {
        rahulShettyMainPage.getRahulShettyLoginPage().clickLoginBtn();
    }

    @Test(priority = 5, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void getErrorMsgAfterEnterWrongPassword(){
        rahulShettyMainPage.getRahulShettyLoginPage().isMsgDisplayed();
        String errorMessage = rahulShettyMainPage.getRahulShettyLoginPage().getErrorMsg();
        Assert.assertEquals(errorMessage,"Your email or password is incorrect.");
    }

    @Test(priority = 6, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterCorrectPassword(){
        rahulShettyMainPage.getRahulShettyLoginPage().enterPassword(ConfigLoader.getInstance().getRahulShettyPassword());
    }

    @Test(priority = 7, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickOnLoginButtonAfterEnterCorrectPassword(){
        rahulShettyMainPage.getRahulShettyLoginPage().clickLoginBtn();

    }
}
