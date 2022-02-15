package com.routech.automation.test.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.routech.automation.test.BaseTest.driver;

public class Listener extends Utilities implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        takeScreenShot(driver, result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
       String methodName = result.getName();
        writeLogs("fail",methodName + " got failed, kindly check the error log");
        takeScreenShot(driver, result);

    }
}
