package com.adminarea.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomerPage {

	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//a[@class='btn btn-warning ornagebutton']")
	WebElement loginbutton;

	@FindBy(name = "EmailId")
	WebElement emailId;
}
