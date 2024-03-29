package com.routech.automation.test.googlePages;

import com.routech.automation.google.googleGmailPages.GoogleGmailMainpage;
import com.routech.automation.google.googleMainPages.GoogleMainPage;
import com.routech.automation.test.BaseTest;
import com.routech.automation.utils.ConfigLoader;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {

    private GoogleMainPage googleMainPage;
    private GoogleGmailMainpage googleGmailMainpage;


    @BeforeTest
    public void setupPages(){
        this.googleMainPage = new GoogleMainPage(getDriver());
        this.googleGmailMainpage = new GoogleGmailMainpage(getDriver());

    }

    @Test(priority = 1, groups = {"Gmail", "a:Roushan Giri"})
    public void openGoogleMainPage(){
        util.writeLogs("Info","Executing from " + browser);
        googleMainPage.goTO();
        util.writeLogs("info","Opening google main search page.");
        util.writeLogs("pass","passed");

    }
    @Test(priority = 2, groups = {"Gmail", "a:Roushan Giri"})
    public void clickGmailIcon(){
        util.writeLogs("Info","Executing from " + browser);
        googleMainPage.getGoogleSearchWidget().clickGmailIcon();
        util.writeLogs("info","Re-directing to google gmail login page.");
    }

    @Test(priority = 3, groups = {"Gmail", "a:Roushan Giri"})
    public void clickOnSignInBtn(){
        util.writeLogs("Info","Executing from " + browser);
        //googleGmailMainpage.getGoogleGmailPageWidget().isDisplayed();
        //googleGmailMainpage.getGoogleGmailPageWidget().clickGmailSignInBtn();
        util.writeLogs("info","On google gmail page clicking on signIn button.");
    }

    @Test(priority = 4, groups = {"Gmail", "a:Roushan Giri"})
    public void enterUsername() {
        util.writeLogs("Info","Executing from " + browser);
        googleGmailMainpage.getGoogleGmailSignInPage().enterUsername(ConfigLoader.getInstance().getGmailUsername());
        util.writeLogs("info","Entering the username in google mail sign in page");
    }
    @Test(priority = 5, groups = {"Gmail", "a:Roushan Giri"})
    public void clickNextAfterEnteringUsername() {
        util.writeLogs("Info","Executing from " + browser);
        googleGmailMainpage.getGoogleGmailSignInPage().clickNextBtn();
        util.writeLogs("info","After entering the username in google mail" +
                " sign in page clicking the next button.");
    }

/*    @Test(priority = 6, groups = {"Gmail", "a:Roushan Giri"})
    public void enterPassword(){
        googleGmailMainpage.getGoogleSignInPasswordPage().isDisplayed();
        googleGmailMainpage.getGoogleSignInPasswordPage().enterPassword(ConfigLoader.getInstance().getGmailPassword());
        util.writeLogs("info","Entering the password after clicking next button.");

       }

    @Test(priority = 7,dependsOnMethods = "enterPassword", groups = {"Gmail", "a:Roushan Giri"})
    public void clickNextAfterEnteringPassword(){
        googleGmailMainpage.getGoogleSignInPasswordPage().clickNextBtn();
        util.writeLogs("info","After entering the password in google mail" +
                " sign in page clicking the next button.");
    }*/
}
