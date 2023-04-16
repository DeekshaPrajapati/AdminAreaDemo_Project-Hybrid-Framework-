package com.Mahakaal.NewTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.Mahakaal.pages.LoginPage;
import com.Mahakaal.utility.PropertyReader;


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

}
