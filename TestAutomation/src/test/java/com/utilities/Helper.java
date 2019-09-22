package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Helper {
	
	public static void captureScreenshot(WebDriver driver, String methodName) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./Screenshots/"+methodName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
