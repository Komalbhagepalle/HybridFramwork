package com.TestData;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LogPage;

public class LogPageTest extends BaseClass {
	
	@BeforeClass
	public void setup() {
		BaseClass.initilization();
	}
	
	@Test
	public void validateLogFuncatinality() {
		LogPage logpage = new LogPage();
		logpage.logfuncatinality("Admin", "admin123");
	}
    
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
