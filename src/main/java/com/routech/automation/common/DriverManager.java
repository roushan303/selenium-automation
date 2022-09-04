package com.routech.automation.common;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected abstract WebDriver createDriver(boolean headlessFlag);
    public WebDriver driver;

    public DriverManager(final WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver createInstance(boolean headlessFlag) {
        if(null == driver){
            driver = createDriver(headlessFlag);
        }
        return driver;
    }
}
