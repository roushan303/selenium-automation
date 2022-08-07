package com.routech.automation.seleniumPractice.locatorsPractice;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyLocatorsPracticeWelcomePage extends AbstractComponent {

    @FindBy(xpath = "//p[contains(text(),'You are successfully logged in.')]")
    private WebElement loginMsg;


    public RahulShettyLocatorsPracticeWelcomePage(WebDriver driver) {
        super(driver);
    }

    public String verifyingSuccessMessage(){
        return(loginMsg.getText());
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.loginMsg.isDisplayed());
    }
}
