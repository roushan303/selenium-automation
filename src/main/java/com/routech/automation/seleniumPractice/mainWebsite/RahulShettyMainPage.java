package com.routech.automation.seleniumPractice.mainWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyMainPage {

    private WebDriver driver;

    private RahulShettyHomePage rahulShettyHomePage;

    private RahulShettyLoginPage rahulShettyLoginPage;

    public RahulShettyMainPage(final WebDriver driver){
        this.driver = driver;
        this.rahulShettyHomePage = PageFactory.initElements(driver,RahulShettyHomePage.class);
        this.rahulShettyLoginPage = PageFactory.initElements(driver,RahulShettyLoginPage.class);
    }

    public void goTo(){
        this.driver.get("https://www.rahulshettyacademy.com/");
    }

    public void navigateBack(){
        this.driver.navigate().back();
    }

    public void navigateForward(){
        this.driver.navigate().forward();
    }

    public RahulShettyHomePage getRahulShettyHomePage() {
        return rahulShettyHomePage;
    }

    public RahulShettyLoginPage getRahulShettyLoginPage() {
        return rahulShettyLoginPage;
    }

}
