package com.routech.automation.test.seleniumPractice.automationPractice;

import com.routech.automation.seleniumPractice.automationPractice.AutomationPracticeMainPage;
import com.routech.automation.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticePageTest extends BaseTest {

    private AutomationPracticeMainPage automationPracticeMainPage;

    @BeforeTest
    public void setupPages(){
        this.automationPracticeMainPage = new AutomationPracticeMainPage(getDriver());
    }

    @Test(priority = 1, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void openAutomationPracticePage(){
        util.writeLogs("Info","Executing from " + browser);
        this.automationPracticeMainPage.goTo();
    }

    @Test(priority = 2, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void getButtonHeaderMsg(){
        util.writeLogs("Info","Executing from " + browser);
        String buttonHeaderMsg = automationPracticeMainPage.getAutomationPracticePage().getbuttonHeader();
        System.out.println(buttonHeaderMsg);
    }

    @Test(priority = 3, groups = {"RahulShettyAcademy", "a:Roushan Giri"})
    public void getBlinkTextMessage(){
        util.writeLogs("Info","Executing from " + browser);
        String blinkTextMsg = automationPracticeMainPage.getAutomationPracticePage().getBlinkingText();
        System.out.println(blinkTextMsg);
    }
}
