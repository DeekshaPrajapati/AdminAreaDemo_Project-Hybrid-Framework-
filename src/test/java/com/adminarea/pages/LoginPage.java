package com.adminarea.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adminarea.utility.PropertyReader;

import javabase.JavaBase;

public class LoginPage {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement Password;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	
	public void enter_emailid() {
		Email.clear();
		JavaBase.sendkeys(Email, 0, PropertyReader.getDataProperty("EmailID"));
	}
	
	
     public void enter_password() {
		Password.clear();
		JavaBase.sendkeys(Password, 0, PropertyReader.getDataProperty("password"));
	}
     
     public void clickon_loginButton() {
    	 JavaBase.clickOn(LoginButton, 0);
     }
     
     public void validate_dashboardpage() {
    	 JavaBase.validateUrl( PropertyReader.getConfigProperty("expectedUrl"));
     }
      
}
