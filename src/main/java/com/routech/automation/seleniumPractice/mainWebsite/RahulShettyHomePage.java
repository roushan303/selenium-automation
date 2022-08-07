package com.routech.automation.seleniumPractice.mainWebsite;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyHomePage extends AbstractComponent {


    public RahulShettyHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "register-btn")
    private WebElement loginBtn;

    @FindBy(className = "theme-btn")
    private WebElement registerBtn;

    public void clickLoginButton(){
        loginBtn.click();
    }

    public void clickRegisterButton(){
        registerBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return (this.wait.until(driver -> this.loginBtn.isDisplayed()));
    }
}
