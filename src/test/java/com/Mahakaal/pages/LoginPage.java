package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	
      
}
