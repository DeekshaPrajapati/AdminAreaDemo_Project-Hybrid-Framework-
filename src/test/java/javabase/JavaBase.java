package javabase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
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

		@BeforeMethod
		public  void setUpReport(Method method)
		{

				ExtentReports reports=ExtentManager.getExtentReportsInstance();
				ExtentTest extentTest=reports.createTest(method.getName());	
			    Extent.setTest(extentTest);
		}

		public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
				String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
		             //after execution, you could see a folder "FailedTestsScreenshots" under src folder
				String destination = System.getProperty("user.dir") + "/reports/"+screenshotName+dateName+".png";
				File finalDestination = new File(destination);
				FileUtils.copyFile(source, finalDestination);
				return destination;
			}

		@AfterMethod
		protected void afterMethod(ITestResult result,Method method)
		{
			//this.result=result;
			
			if(result.getStatus()==ITestResult.FAILURE)
			{
				try {
					 
					 
					String screenshotPath = JavaBase.getScreenhot(driver, result.getName());
					//To add it in the extent report 
					

			        Extent.getTest().log(Status.FAIL,"Test Case Failed is "+result.getName());
			        Extent.getTest().fail("Captured Screenshot is below:"+Extent.getTest().addScreenCaptureFromPath(screenshotPath));
			            		 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			}
			
			else if(result.getStatus()==ITestResult.SKIP)
			{
				Extent.getTest().log(Status.SKIP,"Test Skipped "+result.getThrowable());
				Extent.getTest().log(Status.SKIP, "Test Case Skipped is "+result.getName());
				
			}
			else
			{
				Extent.getTest().log(Status.PASS, result.getName()+  " ->Test Case Passed ");
			
			}
		  }


		@AfterSuite
		public  void setUpFlushed()
		{
				ExtentManager.getExtentReportsInstance().flush();
			
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
		
		// Validate Url by using soft assert
		public static void validateUrl(String expectUrl) {
			String saveCurrentUrl = driver.getCurrentUrl();
			System.out.println("print expectUrl ----> " + expectUrl);
			soft = new SoftAssert();
			soft.assertEquals(saveCurrentUrl, expectUrl);
			soft.assertAll();

		}
		
		public static void validateTitle(String expectTitle) {
			String savetitle = driver.getTitle();
			System.out.println(savetitle);
			soft.assertEquals(savetitle, expectTitle, "actual and expect title is not matched");
			soft.assertAll();
		}
		
		// click with java excuter
		public static void clickBy_javaExcutu(WebElement element ,int timeout) {
			 WebElement element_withWait = new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));             
		    	 JavascriptExecutor executor = (JavascriptExecutor)driver;	    	
		    	 executor.executeScript("arguments[0].click();", element_withWait);
			}
		
		 public static void scrollDown(int position) {
				js = (JavascriptExecutor) driver;
				// js.executeScript("window.scrollBy(0,200)");
				js.executeScript("window.scrollBy(0,'" + position + "')");

			}
		 
		
}