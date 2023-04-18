package com.adminarea.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adminarea.pages.LoginPage;
import com.adminarea.utility.PropertyReader;

import javabase.JavaBase;

public class LoginPageTestCases    {
	
	public  LoginPage loginpage;
	public WebDriver driver;
	

	@Test(priority=1)
	public void openBrow() {
		driver=JavaBase.getDriver();
		
	}
	
	@Test(priority=2)
	public void user_open_url() {
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.openUrl(PropertyReader.getConfigProperty("url"));

	}
	
	@Test(priority=3)
	public void user_enter_email() {
		loginpage.enter_emailid();
	}
	
	@Test(priority=4)
	public void user_enter_password() {
		loginpage.enter_password();
	}
	
	
	@Test(priority=5)
	public void user_clickon_loginbutton() {
		loginpage.clickon_loginButton();
	}
	
	
	@Test(priority=6)
	public void user_validate_dashboardpage() {
		loginpage.validate_dashboardpage();
	}

}
