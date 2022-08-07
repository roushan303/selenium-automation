package com.routech.automation.seleniumPractice.locatorsPractice;

import com.routech.automation.seleniumPractice.mainWebsite.RahulShettyMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyLocatorsPracticeMainPage {


    private WebDriver driver;

    private RahulShettyLocatorsPracticeLoginPage rahulShettyLocatorsPracticeLoginPage;
    private RahulShettyLocatorsPracticeWelcomePage rahulShettyLocatorsPracticeWelcomePage;

    public RahulShettyLocatorsPracticeMainPage(final WebDriver driver) {
        this.driver = driver;
        this.rahulShettyLocatorsPracticeLoginPage = PageFactory.initElements(driver, RahulShettyLocatorsPracticeLoginPage.class);
        this.rahulShettyLocatorsPracticeWelcomePage = PageFactory.initElements(driver,RahulShettyLocatorsPracticeWelcomePage.class);
    }

    public RahulShettyLocatorsPracticeLoginPage getRahulShettyLocatorsPracticeLoginPage() {
        return rahulShettyLocatorsPracticeLoginPage;
    }

    public RahulShettyLocatorsPracticeWelcomePage getRahulShettyLocatorsPracticeWelcomePage() {
        return rahulShettyLocatorsPracticeWelcomePage;
    }

    public void goTo() {
        this.driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }
}
