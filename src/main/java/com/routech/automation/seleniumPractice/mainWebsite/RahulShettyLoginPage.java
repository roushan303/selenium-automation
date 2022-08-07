package com.routech.automation.seleniumPractice.mainWebsite;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyLoginPage extends AbstractComponent {


    @FindBy(id = "email")
    private WebElement emailBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(name = "commit")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")
    private WebElement errorMsg;

    public RahulShettyLoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailId(String email){
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public String getErrorMsg(){
        return errorMsg.getText();
    }

    public boolean isMsgDisplayed(){
        return wait.until(driver -> this.errorMsg.isDisplayed());
    }


    @Override
    public boolean isDisplayed() {
        return wait.until(driver -> this.loginBtn.isDisplayed());
    }
}
