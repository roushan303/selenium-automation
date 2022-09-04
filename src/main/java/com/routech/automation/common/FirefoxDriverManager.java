package com.routech.automation.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{

   //public WebDriver driver;

    public FirefoxDriverManager(WebDriver driver) {
        super(driver);
    }


    @Override
    protected WebDriver createDriver(boolean headlessFlag) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions option = new FirefoxOptions();
        option.setHeadless(headlessFlag);
        driver = new FirefoxDriver(option);
        return driver;
    }
}
