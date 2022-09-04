package com.routech.automation.test;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.routech.automation.common.DriverFactory;
import com.routech.automation.common.DriverType;
import com.routech.automation.utils.Util;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners({ExtentITestListenerClassAdapter.class,ListenerTest.class})
public class BaseTest {

    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static Util util;
    public static DriverType browser;



    @Parameters({"browser","headlessFlag"})
    @BeforeTest
    public void setUp(@Optional("CHROME") DriverType browser, @Optional("true") boolean headlessFlag){
        WebDriver driver = DriverFactory.driverSetup(browser,headlessFlag);
        threadLocalDriver.set(driver);
        System.out.println("Before Test Thread ID: "+Thread.currentThread().getId());
        getDriver();
        this.browser = browser;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        util = new Util(driver,browser);

    }

    public static WebDriver getDriver(){
        return threadLocalDriver.get();
    }



/*    @BeforeTest
    public void setUpDriver(){
        driverManagerFactory = new DriverManagerFactory();
        //driverManager = driverManagerFactory.getManager(DriverType.FIREFOX);
        driverManager = driverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManagerFactory.getDriverManager().createInstance();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        util = new Util(driver);

    }*/

/*
    @Parameters({"browser"})
    @BeforeTest
    public void setUpDriver(DriverType browser){

        DriverManagerFactory driverManagerFactory = new DriverManagerFactory();
        driverManagerFactory.getManager(browser);
        driver = driverManagerFactory.getDriverManager().createInstance();

      // DriverFactory.getInstance().setDriver(driver);
       // driver = DriverFactory.getInstance().getDriver();

        BaseTest.browser = browser;
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        util = new Util(driver);

    }*/




/*    @BeforeTest
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.setHeadless(false);
        this.driver = new ChromeDriver(option);
        DriverFactory.getInstance().setDriver(driver);
        driver = DriverFactory.getInstance().getDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().deleteAllCookies();
        util = new Util(this.driver);


    }*/

    @BeforeClass
    public void testCaseTwo() {
        //Printing class name and Id of the thread on using which test method got executed
        System.out.println("Test Case " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
    }



    @AfterTest
    public void tearDown(){
        //Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        //DriverFactory.getInstance().quitDriver();
        getDriver().quit();

        System.out.println("After Test Thread ID: "+Thread.currentThread().getId());

        threadLocalDriver.remove();

    }
}
