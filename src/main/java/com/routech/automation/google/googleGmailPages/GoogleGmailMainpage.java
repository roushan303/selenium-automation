package com.routech.automation.googleGmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleGmailMainpage {

    protected WebDriver driver;
    private GoogleGmailPageWidget googleGmailPageWidget;
    private GoogleGmailSignInPage googleGmailSignInPage;
    private GoogleSignInPasswordPage googleSignInPasswordPage;

    public GoogleGmailMainpage(final WebDriver driver){
        this.googleGmailPageWidget = PageFactory.initElements(driver, GoogleGmailPageWidget.class);
        this.googleGmailSignInPage = PageFactory.initElements(driver,GoogleGmailSignInPage.class);
        this.googleSignInPasswordPage = PageFactory.initElements(driver, GoogleSignInPasswordPage.class);
    }

    public GoogleGmailPageWidget getGoogleGmailPageWidget() {
        return googleGmailPageWidget;
    }

    public GoogleGmailSignInPage getGoogleGmailSignInPage() {
        return googleGmailSignInPage;
    }

    public GoogleSignInPasswordPage getGoogleSignInPasswordPage() {
        return googleSignInPasswordPage;
    }
}
