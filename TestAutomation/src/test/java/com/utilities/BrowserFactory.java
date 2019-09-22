package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

	WebDriver driver;
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("This browser is not supported");
		}
		
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void quitApplication(WebDriver driver) {
		
		driver.quit();
	}
} 
