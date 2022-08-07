package com.routech.automation.test;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTest extends BaseTest implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        util.takeScreenShot(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
       String methodName = result.getName();
       util.writeLogs("fail",methodName + " got failed, kindly check the error log");
        util.takeScreenShot(result);

    }
}
