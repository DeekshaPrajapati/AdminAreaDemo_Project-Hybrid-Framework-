package WithoutPageObjectModelDataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ContactUsTestCases extends javaBase {
	
	
	 
	@Test(priority=1)
	public void startApplication() {
		
		driver.get("https://www.saucedemo.com/");
		//String expect="https://www.saucedemo.com/";
	      //String currenturl   =driver.getCurrentUrl();
	         //String expect="https://www.saucedemo.com/";
	    // Assert.assertEquals(currenturl,expect );
	     //Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed());
	      
	    
	}
	
	@DataProvider(name="LoginData")
	public  Object[][]getData(){
		String[][] loginData=ExcelReader.readExcel();   
	             return loginData;
	}
	
	
	
	@Test( priority=2,dataProvider="LoginData")
	public void login(String username, String password) {
		  driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys(username);
	     driver.findElement(By.id("password")).sendKeys(password);
	     driver.findElement(By.name("login-button")).click();
		
	}
	

		

}
