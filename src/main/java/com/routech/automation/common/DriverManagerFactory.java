package com.routech.automation.common;

import org.openqa.selenium.WebDriver;

public class DriverManagerFactory {

    protected WebDriver driver;
    protected DriverManager driverManager;


    public DriverManager getDriverManager() {
        return driverManager;
    }



    public DriverManager getManager(DriverType type){
        switch (type){
            case CHROME -> driverManager = new ChromeDriverManager(driver);
            default -> driverManager = new FirefoxDriverManager(driver);
        }
        return driverManager;
    }
}
