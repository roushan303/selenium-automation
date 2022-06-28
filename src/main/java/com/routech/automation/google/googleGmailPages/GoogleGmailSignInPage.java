package com.routech.automation.google.googleGmailPages;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleGmailSignInPage extends AbstractComponent {

    @FindBy(id = "identifierId")
    private WebElement signInTextBox;

    @FindBy(id = "identifierNext")
    private WebElement nextBtn;

    public GoogleGmailSignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username){
        this.signInTextBox.sendKeys(username);
    }

    public void clickBtn(){
        this.nextBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.signInTextBox.isDisplayed());
    }
}
