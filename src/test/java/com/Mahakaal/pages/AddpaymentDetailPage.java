package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javabase.JavaBase;

public class AddpaymentDetailPage {

	    public WebDriver driver;
	@FindBy(xpath="//input[@name='payer_first_name']")
	  WebElement enterYourName;
	  
	  @FindBy(name="payer_last_name")
	  WebElement enterYourLastName;
	  
	  @FindBy(xpath="//input[@name='payer_contact']")
	  WebElement contactNum;
	  
	  @FindBy(name="payer_email")
	  WebElement enterYouremail;
	  
	  @FindBy(name="payer_address")
	  WebElement EnterYourAddress;
	  
	  @FindBy(xpath="//button[@type='btn']")
	   WebElement proceedToPayment;
	   
	public AddpaymentDetailPage(WebDriver driver) {
		 this.driver=driver;
	}
	
	public void Enter_FirstName(String fname) {
	 JavaBase.sendKeys("enterYourName",enterYourName,fname,1);
	}
	
	public void enter_LastName(String lname) {
		JavaBase.sendKeys("enterYourLastName",enterYourLastName,lname,1);
	}
	
	public void enter_ContactNumber(String num) {
		JavaBase.sendKeys("contactNum", contactNum,num,1);
	}
	
	public void enter_Email(String email) {
		JavaBase.sendKeys("enterYouremail",enterYouremail,email,1);
	}
	
	public void enter_Address(String address) {
		JavaBase.sendKeys("EnterYourAddress",EnterYourAddress,address,1);
	}
	

public void clickon_ProceedPaymentBtn() {
	JavaBase.clickOn("proceedToPayment",proceedToPayment,4);
		
	}
	
	
}
