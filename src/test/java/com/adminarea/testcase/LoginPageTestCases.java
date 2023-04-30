package com.adminarea.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adminarea.extentreport.Extent;
import com.adminarea.pages.LoginPage;
import com.adminarea.utility.PropertyReader;
import com.aventstack.extentreports.Status;

import javabase.JavaBase;

public class LoginPageTestCases extends JavaBase    {
	
	public  LoginPage loginpage;
	public WebDriver driver;
	

	@Test(priority=1)
	public void openBrow() {
		driver=JavaBase.getDriver();
		
	}
	
	@Test(priority=2)
	public void user_open_url() {
		Extent.getTest().log(Status.INFO,"User Open a website");
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.openUrl(PropertyReader.getConfigProperty("url"));

	}
	
	@Test(priority=3)
	public void user_enter_email() {
		Extent.getTest().log(Status.INFO,"User enter a email address");
		loginpage.enter_emailid();
	}
	
	@Test(priority=4)
	public void user_enter_password() {
		Extent.getTest().log(Status.INFO,"User enter a password");
		loginpage.enter_password();
	}
	
	
	@Test(priority=5)
	public void user_clickon_loginbutton() {
		Extent.getTest().log(Status.INFO,"User click on login butoon");
		loginpage.clickon_loginButton();
	}
	
	
	@Test(priority=6)
	public void user_validate_dashboardpage() {
		Extent.getTest().log(Status.INFO,"After login complete user validate a dashboard page ");
		loginpage.validate_dashboardpage();
	}

}
