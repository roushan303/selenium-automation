package com.routech.automation.test.googlePages;

import com.routech.automation.google.googleGmailPages.GoogleGmailMainpage;
import com.routech.automation.google.googleMainPages.GoogleMainPage;
import com.routech.automation.test.BaseTest;
import com.routech.automation.test.utils.Listener;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(Listener.class)
public class GoogleTest extends BaseTest {

    private GoogleMainPage googleMainPage;
    private GoogleGmailMainpage googleGmailMainpage;


    @BeforeTest
    public void setupPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleGmailMainpage = new GoogleGmailMainpage(driver);

    }

    @Test(priority = 1, groups = {"Gmail", "a:Roushan Giri"})
    public void openGoogleMainPage(){
        googleMainPage.goTO();
        writeLogs("info","Opening google main search page.");
        writeLogs("pass","passed");

    }
    @Test(priority = 2, groups = {"Gmail", "a:Roushan Giri"})
    public void clickGmailIcon(){
        googleMainPage.getGoogleSearchWidget().clickGmailIcon();
        writeLogs("info","Re-directing to google gmail login page.");
    }

    @Test(priority = 3, groups = {"Gmail", "a:Roushan Giri"})
    public void clickOnSignInBtn(){
        googleGmailMainpage.getGoogleGmailPageWidget().clickGmailSignInBtn();
        writeLogs("info","On google gmail page clicking on signIn button.");
    }

    @Test(priority = 4, groups = {"Gmail", "a:Roushan Giri"})
    public void enterUsername() throws IOException {
        googleGmailMainpage.getGoogleGmailSignInPage().enterUsername("roushan303@gmail.com");
        writeLogs("info","Entering the username in google mail sign in page");
    }
    @Test(priority = 5, groups = {"Gmail", "a:Roushan Giri"})
    public void clickNextAfterEnteringUsername() {
        googleGmailMainpage.getGoogleGmailSignInPage().clickBtn();
        writeLogs("info","After entering the username in google mail" +
                " sign in page clicking the next button.");
    }
//
//    @Test(priority = 6, groups = {"Gmail", "a:Roushan Giri"})
//    public void enterPassword(){
//        googleGmailMainpage.getGoogleSignInPasswordPage().enterPassword("Keepsecret@101");
//        writeLogs("info","Entering the password after clicking next button.");
//
//       }
//
//    @Test(priority = 7,dependsOnMethods = "enterPassword", groups = {"Gmail", "a:Roushan Giri"})
//    public void clickNextAfterEnteringPassword(){
//        googleGmailMainpage.getGoogleSignInPasswordPage().clickNextBtn();
//        writeLogs("info","After entering the password in google mail" +
//                " sign in page clicking the next button.");
//    }
}
