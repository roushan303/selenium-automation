package com.routech.automation.utils;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Util {

    private WebDriver driver;

    public Util(final WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenShot(ITestResult result) {
        String methodName = result.getName();
        String destPath = "test-output/SparkReport/screenshot/" + methodName +"-img.png";
        File srcFile = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(destPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExtentTestManager.getTest(result).addScreenCaptureFromPath("screenshot/" + methodName + "-img.png");
    }

    public void writeLogs(String logType, String message) {
        switch (logType.toLowerCase()) {
            case "pass":
                //ExtentTestManager.getTest().log(Status.PASS, message);
                ExtentTestManager.getTest().pass(MarkupHelper.createLabel(message, ExtentColor.AMBER));
                break;
            case "fail":
                ExtentTestManager.getTest().log(Status.FAIL, message);
                break;
            case "info":
                //ExtentTestManager.getTest().log(Status.INFO,message);
                ExtentTestManager.getTest().info(MarkupHelper.createLabel(message, ExtentColor.CYAN));
                break;

        }

    }
}
