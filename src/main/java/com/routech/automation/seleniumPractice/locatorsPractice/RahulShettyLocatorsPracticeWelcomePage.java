package com.routech.automation.seleniumPractice.locatorsPractice;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyLocatorsPracticeWelcomePage extends AbstractComponent {

   @FindBy(tagName = "h2")
    private WebElement usernameMsg;

    @FindBy(tagName = "p")
    private WebElement loginMsg;


    public RahulShettyLocatorsPracticeWelcomePage(WebDriver driver) {
        super(driver);
    }

    public String verifyingSuccessMessage(){
        return(loginMsg.getText());
    }
    public String verifyUsernameMessage(){return (usernameMsg.getText());}

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.loginMsg.isDisplayed());
    }
}
