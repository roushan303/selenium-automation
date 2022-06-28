package com.routech.automation.google.googleMainPages;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleSearchWidget extends AbstractComponent {


    @FindBy(linkText = "Gmail")
    private WebElement gmailIcon;

    public GoogleSearchWidget(final WebDriver driver){
        super(driver);
    }

    public void clickGmailIcon(){
        this.gmailIcon.click();
    }


    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(gmailIcon));
        return this.gmailIcon.isDisplayed();
    }
}
