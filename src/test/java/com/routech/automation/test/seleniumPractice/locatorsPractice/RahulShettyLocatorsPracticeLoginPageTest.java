package com.routech.automation.test.seleniumPractice.locatorsPractice;

import com.routech.automation.seleniumPractice.locatorsPractice.RahulShettyLocatorsPracticeMainPage;
import com.routech.automation.test.BaseTest;
import com.routech.automation.utils.ConfigLoader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulShettyLocatorsPracticeLoginPageTest extends BaseTest {

    private RahulShettyLocatorsPracticeMainPage rahulShettyLocatorsPracticeMainPage;

    @BeforeTest(groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void setUpPages() {
        this.rahulShettyLocatorsPracticeMainPage = new RahulShettyLocatorsPracticeMainPage(getDriver());
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openRahulShettyLocatorsPracticePageForCorrectCred(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyLocatorsPracticeMainPage.goTo();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterUsernameForRahulShetty() {
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().enterUsername(ConfigLoader.getInstance().getRahulShettyUserName());
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterPasswordForRahulShetty(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().enterPassword(ConfigLoader.getInstance().getRahulShettyPassword());
    }

    @Test(priority = 4, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickSignInButton(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().clickSignInBtn();
    }

    @Test(priority = 5, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void validateLoginSuccessMessage(){
        util.writeLogs("Info","Executing from " + browser);
        rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeWelcomePage().isDisplayed();
        String msg = rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeWelcomePage().verifyingSuccessMessage();
        Assert.assertEquals(msg,"You are successfully logged in.");
        String username = ConfigLoader.getInstance().getRahulShettyUserName();
        String usernameMsg = rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeWelcomePage().verifyUsernameMessage();
        Assert.assertEquals(usernameMsg, "Hello " + username + ",");
    }
}
