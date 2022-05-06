package com.PageLayer;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LogPage {
	public class LogPageTest extends BaseClass{
		
		// Object Repositories with the help of page Factory
		@FindBy(id = "txtUsername")
		WebElement username;

		@FindBy(id = "txtPassword")
		WebElement password;

		@FindBy(id = "btnLogin")
		WebElement loginButton;

		@FindBy(id = "spanMessage")
		WebElement errorMessage;

		@FindBy(xpath = "//a[text()='Forgot your password?']")
		WebElement forgotPasswordLink;

		public void LogPage() {
			SearchContext driver = null;
			PageFactory.initElements(driver, this);
		}

		// Associated methods for OR.

		public void loginFunctionality(String uname, String pass) 
		{
			username.sendKeys(uname);
			password.sendKeys(pass);
			loginButton.click();

			if (uname == "Admin" && pass == "admin123")
			{
				loginButton.click();
				
			}
			else if ((!(uname == "Admin") || !(pass == "Admin123"))) {
				loginButton.click();
				String a= errorMessage.getText();
				System.out.println(a);
			}

	}

	public void logfuncatinality(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	}

	public void logfuncatinality(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
