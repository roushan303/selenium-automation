package com.routech.automation.test.amazon;

import com.routech.automation.amazon.AmazonMainPage;
import com.routech.automation.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    private AmazonMainPage amazonMainPage;

    @BeforeTest
    public void setupPages() {
        this.amazonMainPage = new AmazonMainPage(getDriver());
    }

    @Test(priority = 1, groups = {"Amazon", "a:Roushan Giri"})
    public void openAmazonHomePage() {
        util.writeLogs("Info","Executing from " + browser);
        amazonMainPage.goTo();

    }

    @Test(priority = 2, groups = {"Amazon", "a:Roushan Giri"})
    public void searchProductOnHomePage() {
        util.writeLogs("Info","Executing from " + browser);
        amazonMainPage.getAmazonHomePage().searchProduct("Iphone");
        amazonMainPage.getAmazonHomePage().clickBtn();
    }

}
