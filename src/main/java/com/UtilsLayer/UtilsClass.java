package com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	public static void explicitWait(int Wait, By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Wait));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void takeScreenShot(String screenShotFolder, String filename) {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(f,
					new File(System.getProperty("user.dir") + "\\" + screenShotFolder + "\\" + filename + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
