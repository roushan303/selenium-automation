package com.routech.automation.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage {

    private WebDriver driver;
    private AmazonHomePage amazonHomePage;

    public AmazonMainPage(final WebDriver driver) {
        this.driver = driver;
        this.amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
    }

    public void goTo() {
        this.driver.get("https://www.amazon.in/");
    }

    public AmazonHomePage getAmazonHomePage() {
        return amazonHomePage;
    }
}
