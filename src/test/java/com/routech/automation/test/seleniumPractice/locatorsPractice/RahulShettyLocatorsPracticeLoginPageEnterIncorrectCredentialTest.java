package com.routech.automation.test.seleniumPractice.locatorsPractice;

import com.routech.automation.seleniumPractice.locatorsPractice.RahulShettyLocatorsPracticeMainPage;
import com.routech.automation.test.BaseTest;
import com.routech.automation.utils.ConfigLoader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulShettyLocatorsPracticeLoginPageEnterIncorrectCredentialTest extends BaseTest {

    private RahulShettyLocatorsPracticeMainPage rahulShettyLocatorsPracticeMainPage;

    @BeforeTest(groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void pagesetup(){
        this.rahulShettyLocatorsPracticeMainPage = new RahulShettyLocatorsPracticeMainPage(getDriver());
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openRahulShettyLocatorsPracticePage(){
        util.writeLogs("Info","Executing from " + browser);
        this.rahulShettyLocatorsPracticeMainPage.goTo();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterUsernameForRahulShettyPracticePage(){
        util.writeLogs("Info","Executing from " + browser);
        this.rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage()
                .enterUsername(ConfigLoader.getInstance().getRahulShettyUserName());
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void enterIncorrectPasswordForRahulShettyPracticePage(){
        util.writeLogs("Info","Executing from " + browser);
        this.rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage()
                .enterPassword("123455443");
    }

    @Test(priority = 4, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void clickSignInButtonForIncorrectCredTest(){
        util.writeLogs("Info","Executing from " + browser);
        this.rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().clickSignInBtn();
    }

    @Test(priority = 5, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void getErrorMessageAfterEnterIncorrectCred(){
        util.writeLogs("Info","Executing from " + browser);
        this.rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage().isDisplayed();
        String message = this.rahulShettyLocatorsPracticeMainPage.getRahulShettyLocatorsPracticeLoginPage()
                .getErrorMessage();
        Assert.assertEquals(message,"* Incorrect username or password");
    }




}
