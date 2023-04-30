package com.datadriven.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adminarea.extentreport.Extent;
import com.adminarea.utility.PropertyReader;
import com.aventstack.extentreports.Status;

import javabase.JavaBase;



public class LoginDataTestCases extends JavaBase {
	
	public WebDriver driver;
	 
	@Test(priority=1)
	public void startApplication() {
		Extent.getTest().log(Status.INFO,"User Perform Data Driven Testing");
		driver=JavaBase.getDriver(); 
		driver.get(PropertyReader.getConfigProperty("url"));
		
	    
	}
	
	@DataProvider(name="LoginData")
	public  Object[][]getData(){
		String[][] loginData=ExcelReader.readExcel();   
	             return loginData;
	}
	
	
	
	@Test( priority=2,dataProvider="LoginData")
	public void login(String useremail, String password) {
		Extent.getTest().log(Status.INFO,"User login a Website with invalid and valid credientials");
		  driver.findElement(By.xpath("//input[@id='Email']")).clear();
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(useremail);
		 driver.findElement(By.xpath("//input[@id='Password']")).clear();
	     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		
	}
	

		

}
