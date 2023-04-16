package javabase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.Mahakaal.utility.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaBase {
	public static WebDriver driver;
	public static String browzersave;
	public static JavascriptExecutor js;
	
	
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

	
}