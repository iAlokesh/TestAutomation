package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobjects.GoogleSearchPage;
import com.utilities.BaseClass;

public class SecondTest extends BaseClass{
	
	@Test
	public void secondTest() throws InterruptedException, IOException {
		
		GoogleSearchPage gsp = PageFactory.initElements(driver, GoogleSearchPage.class);

		log.info("Google Search");

		gsp.googleSearch(edp.getData("Sheet1", 1, 0));
		Thread.sleep(5000);

		log.pass("Google search done successfully");		
	}

}
