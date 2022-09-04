package com.routech.automation.seleniumPractice.mainWebsite;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RahulShettyHomePage extends AbstractComponent {


    public RahulShettyHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='theme-btn register-btn']")
    private WebElement loginBtn;

    @FindBy(className = "theme-btn")
    private WebElement registerBtn;

    public void clickLoginButton(WebDriver driver){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);
        //loginBtn.click();
    }

    public void clickRegisterButton(WebDriver driver){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", registerBtn);
        //registerBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return (this.wait.until(driver -> this.loginBtn.isDisplayed()));
    }
}
