package com.routech.automation.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class ChromeDriverManager extends DriverManager{


    public ChromeDriverManager(WebDriver driver) {
        super(driver);
    }



    @Override
    protected WebDriver createDriver(boolean headlessFlag) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.setHeadless(headlessFlag);
        driver = new ChromeDriver(option);
        return driver;
    }
}
