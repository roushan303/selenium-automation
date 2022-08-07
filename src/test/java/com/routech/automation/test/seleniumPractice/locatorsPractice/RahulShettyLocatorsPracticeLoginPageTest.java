package com.routech.automation.test.seleniumPractice.locatorsPractice;

import com.routech.automation.seleniumPractice.locatorsPractice.RahulShettyLocatorsPracticeMainPage;
import com.routech.automation.test.BaseTest;
import com.routech.automation.utils.ConfigLoader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulShettyLocatorsPracticeLoginPageTest extends BaseTest {

    private RahulShettyLocatorsPracticeMainPage rahulShettyLocatorsPracticeMainPage;

    @BeforeTest
    public void setUpPages() {
        this.rahulShettyLocatorsPracticeMainPage = new RahulShettyLocatorsPracticeMainPage(driver);
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openRahulShettyLocatorsPracticePage(){
        rahulShettyLocatorsPracticeMainPage.goTo();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterUsernameForRahulShetty() {
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().enterUsername(ConfigLoader.getInstance().getRahulShettyUserName());
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterPasswordForRahulShetty(){
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().enterPassword(ConfigLoader.getInstance().getRahulShettyPassword());
    }

    @Test(priority = 4, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickSignInButton(){
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().clickSignInBtn();
    }

    @Test(priority = 5, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void validateLoginSuccessMessage(){
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeWelcomePage().isDisplayed();
        String msg = rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeWelcomePage().verifyingSuccessMessage();
        Assert.assertEquals(msg,"You are successfully logged in.");
    }
}
