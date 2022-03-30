package Utlis;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.logging.Logger;

 
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;
import StepDefinition.searchProduct;
 

public class TestUtlisUI {

	private static WebDriver driver;
   
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver d) {
		TestUtlisUI.driver = d;
	}

	public static WebElement getWebElement(By locator) {

		return driver.findElement(locator);

	}

	public static boolean validateElementIsDisplayed(By locator) {
		WebElement E = getWebElement(locator);
		E.isDisplayed();
		return false;

	}
	/*
	 * public static void takeScreenshotAtEndOfTest() throws IOException { File
	 * scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); String
	 * currentDir = System.getProperty("user.dir"); FileUtlis.copyFile(scrFile, new
	 * File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png")); }
	 */
	 
}
