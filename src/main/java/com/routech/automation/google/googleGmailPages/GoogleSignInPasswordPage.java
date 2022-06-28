package com.routech.automation.google.googleGmailPages;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSignInPasswordPage extends AbstractComponent {

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(id = "passwordNext")
    private WebElement passwordNextBtn;

    public GoogleSignInPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void enterPassword(String password){
        this.passwordTextField.sendKeys(password);
    }

    public void clickNextBtn(){
        this.passwordNextBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.passwordTextField.isDisplayed());
    }
}
