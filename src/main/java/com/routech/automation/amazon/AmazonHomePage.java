package com.routech.automation.amazon;

import com.routech.automation.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends AbstractComponent {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;


    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String product) {
        this.searchBox.sendKeys(product);
    }

    public void clickBtn() {
        this.searchBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.searchBtn.isDisplayed());
    }
}
