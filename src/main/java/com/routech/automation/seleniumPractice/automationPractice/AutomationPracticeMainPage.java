package com.routech.automation.seleniumPractice.automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeMainPage {

    private WebDriver driver;

    private AutomationPracticePage automationPracticePage;

    public AutomationPracticeMainPage(final WebDriver driver){
        this.driver = driver;
        this.automationPracticePage = PageFactory.initElements(driver,AutomationPracticePage.class);
    }

    public AutomationPracticePage getAutomationPracticePage() {
        return automationPracticePage;
    }

    public void goTo(){
        this.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }
}
