package com.routech.automation.google.googleGmailPages;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleGmailPageWidget extends AbstractComponent {

    @FindBy(xpath = "//a[@data-action='sign in']")
    private WebElement gmailSignInBtn;

    public GoogleGmailPageWidget(final WebDriver driver) {
        super(driver);
    }

    public void clickGmailSignInBtn(){
        this.gmailSignInBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.gmailSignInBtn.isDisplayed());
    }
}
