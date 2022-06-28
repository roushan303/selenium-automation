package com.routech.automation.test;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.google.common.util.concurrent.Uninterruptibles;
import com.routech.automation.test.utils.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@Listeners({ExtentITestListenerClassAdapter.class})
public class BaseTest extends Utilities {

    public static WebDriver driver;


    @BeforeTest
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.setHeadless(true);
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        driver.quit();
    }
}
