package com.routech.automation.test;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.google.common.util.concurrent.Uninterruptibles;
import com.routech.automation.utils.Util;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners({ExtentITestListenerClassAdapter.class,ListenerTest.class})
public class BaseTest {

    public static WebDriver driver;
    public static Util util;


    @BeforeTest
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.setHeadless(false);
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        util = new Util(driver);
    }



    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        driver.quit();
    }
}
