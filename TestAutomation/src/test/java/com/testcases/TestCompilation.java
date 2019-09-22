package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pageobjects.GoogleSearchPage;
import com.utilities.BaseClass;
import com.utilities.DynamicTestNG;

public class TestCompilation extends BaseClass {

	@Test
	public void hello() {
		new DynamicTestNG().runTestNGTest();
	}
	
	@Test
	public void TC001() throws InterruptedException, IOException {
		if (edp.getDataFromTestcasePriority("TestcasePriority", "Flag", 2).equalsIgnoreCase("Y")) {
			GoogleSearchPage gsp = PageFactory.initElements(driver, GoogleSearchPage.class);

			log.info("Google Search");

			gsp.googleSearch(edp.getDataFromTestcasePriority("TestcasePriority", "Flag", 2));
			Thread.sleep(5000);

			log.pass("Google search done successfully");
		} else {
			throw new SkipException("Test skipped");
		}
	}

	@Test
	public void tc002(String data) {
		if (edp.getDataFromTestcasePriority("TestcasePriority", "Flag", 3).equalsIgnoreCase("Y")) {
			System.out.println("Parameter Test");
			System.out.println("Hello " + edp.getDataFromTestcasePriority("TC002", "Data2", 10));
		} else {
			throw new SkipException("Test skipped");
		}
	}

	@Test(enabled=true)
	public void tc003() {
		if (edp.getDataFromTestcasePriority("TestcasePriority", "Flag", 4).equalsIgnoreCase("Y")) {
			System.out.println("Test Demo");
		} else {
			throw new SkipException("Test skipped");
		}
	}
}