package com.routech.automation.common;

import org.openqa.selenium.WebDriver;

public class DriverFactory {


    public static WebDriver driverSetup(DriverType browser, boolean headlessFlag){
        WebDriver driver=null;
        DriverManagerFactory driverManagerFactory = new DriverManagerFactory();
        driverManagerFactory.getManager(browser);
        driver = driverManagerFactory.getDriverManager().createInstance(headlessFlag);
        return driver;
    }

}
