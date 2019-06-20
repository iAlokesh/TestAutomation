package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {

	public WebDriver driver;

	public GoogleSearchPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(name = "q")	WebElement searchSection;
	@FindBy(name = "btnK")	WebElement searchButton;

	public void googleSearch(String value) {
		searchSection.sendKeys(value);
		searchButton.click();
	}
}
