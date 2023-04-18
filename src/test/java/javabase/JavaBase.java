package javabase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.adminarea.extentreport.Extent;
import com.adminarea.extentreport.ExtentManager;
import com.adminarea.utility.PropertyReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaBase {
	public static WebDriver driver;
	public static String browzersave;
	public static JavascriptExecutor js;
	public static SoftAssert soft;
	
	
	// singleton
	
		public static WebDriver getDriver() {
	   	 if(driver == null)
	   	 {
	   		browzersave = PropertyReader.getConfigProperty("BrowserName"); // calling browzename
	   		
	   				if (browzersave.equalsIgnoreCase("chrome")) {
	   					WebDriverManager.chromedriver().setup();
	   					driver = new ChromeDriver();
	   				}
	   		
	   				else if (browzersave.equalsIgnoreCase("Firefox")) {
	   					WebDriverManager.firefoxdriver().setup();
	   					driver = new FirefoxDriver();
	   				}
	   		
	   				else if (browzersave.equalsIgnoreCase("Safari")) {
	   					WebDriverManager.safaridriver().setup();
	   					driver = new SafariDriver();
	   				}
	   		
	   				else {
	   		
	   					WebDriverManager.chromedriver().setup();
	   					driver = new ChromeDriver();
	   					
	   					
	   				}
	   				    driver.manage().window().maximize();
						driver.manage().deleteAllCookies();
	   		
	   				return driver;
	   	 }
	  	 else {
	   		 return driver;
	   	 }
	  }
			
		// window maxmize
		public static void maxmizeWindow() {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}

		
		
	
		
		// send keys
		public static void sendkeys(WebElement element,int timeout, String value) {
		WebElement	element_withWait = new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element_withWait.sendKeys(value);

		}

		// click
		public static void clickOn(WebElement element, int timeout) {
			WebElement	element_withWait = new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
			element_withWait.click();
       }
		
		
		public static void validateUrl(String expectUrl) {
			String saveCurrentUrl = driver.getCurrentUrl();
			System.out.println("print expectUrl ----> " + expectUrl);
			soft = new SoftAssert();
			soft.assertEquals(saveCurrentUrl, expectUrl);
			soft.assertAll();

		}
}