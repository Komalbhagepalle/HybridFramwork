//package com.TestLayer;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.BaseLayer.BaseClass;
//
//import junit.framework.Assert;
//
//public class TestLayer1 {
//
//	public static void main(String[] args) {
//		@BeforeClass
//
//		public void setup() {
//			BaseClass.initilization();
//		}
//
//		@Test(priority = 1)
//		public void validateLoginFunctionality() Object driver;
//		{
//			Assert.assertEquals(driver.getTitle().contains("OrangeHRM"), true);
//			Assert.assertEquals(driver.getCurrentUrl().contains("opensource-demo"), true);
//		}
//
//		@Test(priority = 2)
//		public void login() {
//			LoginPage loginpage= new LoginPage();
//
//			loginpage.login(prop.getProperty("UserName"), prop.getProperty("PassWord"));
//		}
//		
//		@Test(priority = 3)
//		public void validateHomeFunctionality() {
//			Assert.assertEquals(driver.getTitle().contains("OrangeHRM"), true);
//			Assert.assertEquals(driver.getCurrentUrl().contains("orangehrmlive"), true);
//		}
//	}

//}
