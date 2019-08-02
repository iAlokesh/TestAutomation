package com.utilities;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	protected WebDriver driver;
	protected ExcelDataProvider edp;
	protected ExcelReader ereader;
	public ConfigurationClass cc;
	public ExtentReports er;
	public ExtentTest log;
	public String methodName;

	//It will run before suite
	@BeforeSuite
	public void setUpSuite() {
		edp = new ExcelDataProvider();
		cc = new ConfigurationClass();
	}

	@BeforeClass
	public void setUp() {
		driver = BrowserFactory.startApplication(driver, cc.getBrowserName(), cc.getAppURL());
	}

	@AfterClass
	public void tearDown() {
		
		BrowserFactory.quitApplication(driver);
	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

			Helper.captureScreenshot(driver);
		}
		er.flush();
	}

	@BeforeMethod
	public void reportInitialize(Method method) {

		methodName = method.getName();
		ExtentReporter eroporter = new ExtentHtmlReporter(new File("./Reports/" + methodName + ".html"));
		er = new ExtentReports();
		er.attachReporter(eroporter);
		log = er.createTest(methodName);
	}
}
