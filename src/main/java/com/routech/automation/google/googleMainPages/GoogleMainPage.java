package com.routech.automation.google.googleMainPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private GoogleSearchWidget googleSearchWidget;

    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        this.googleSearchWidget = PageFactory.initElements(driver, GoogleSearchWidget.class);
    }

    public void goTO(){
        this.driver.get("https://www.google.com");
    }

    public GoogleSearchWidget getGoogleSearchWidget() {
        return googleSearchWidget;
    }
}
