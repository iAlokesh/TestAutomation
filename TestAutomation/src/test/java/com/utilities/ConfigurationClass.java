package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationClass {

	Properties p;
	
	public ConfigurationClass() {
		
		File src = new File("./Config/Config.properties");		
		try {
			FileInputStream fis = new FileInputStream(src);
			p = new Properties();
		    p.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public String getBrowserName() {
		return p.getProperty("Browser");
	}
	
	public String getAppURL() {
		return p.getProperty("appURL");
	}
}
