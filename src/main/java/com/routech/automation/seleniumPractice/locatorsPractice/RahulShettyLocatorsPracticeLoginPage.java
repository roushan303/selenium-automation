package com.routech.automation.seleniumPractice.locatorsPractice;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyLocatorsPracticeLoginPage extends AbstractComponent {

    @FindBy(id="inputUsername")
    private WebElement username;

    @FindBy(name="inputPassword")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public RahulShettyLocatorsPracticeLoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String userId){
        username.sendKeys(userId);
    }

    public void enterPassword(String passkey){
        password.sendKeys(passkey);
    }

    public void clickSignInBtn(){
        signInButton.click();
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
}
