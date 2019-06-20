package com.testcases;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobjects.GoogleSearchPage;
import com.utilities.BaseClass;

public class DemoTest extends BaseClass {

	@Test
	public void demoTest() throws InterruptedException, IOException {

		GoogleSearchPage gsp = PageFactory.initElements(driver, GoogleSearchPage.class);

		log.info("Google Search");

		gsp.googleSearch(edp.getData("Sheet1", 0, 0));
		Thread.sleep(5000);

		log.pass("Google search done successfully");
	}
}
