package com.routech.automation.seleniumPractice.automationPractice;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticePage extends AbstractComponent {

    @FindBy(xpath = "//header/div/button[1]/following-sibling::button[1]")
    WebElement buttonHeader;

    @FindBy(xpath = "//header/div/button[1]/parent::div/parent::header/a[2]")
    WebElement blinkingText;


    public AutomationPracticePage(WebDriver driver) {
        super(driver);
    }

    public String getbuttonHeader(){
        String buttonHeadermsg = buttonHeader.getText();
        return buttonHeadermsg;
    }

    public String getBlinkingText(){
        String blinkText = blinkingText.getText();
        return blinkText;
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.buttonHeader.isDisplayed());
    }
}
