package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Helper {

	public static void captureScreenshot(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./Screenshots/Login.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
