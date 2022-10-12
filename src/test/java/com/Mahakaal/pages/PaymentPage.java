package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javabase.JavaBase;

public class PaymentPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()=' Credit Card ']")
	  WebElement CreditCardButton;
	
	@FindBy(xpath="//input[@id='cc-number']") 
	  WebElement CardNumber;
	
	@FindBy(xpath="//input[@id='card-holder-name']")
	  WebElement CardHolderName;
	
	@FindBy(xpath="//input[@id='cc-exp-date']")
	  WebElement ExpiryMY; 
	
	@FindBy(xpath="//label[text()='CVV']")
	  WebElement CVVNumber;
	
	@FindBy(xpath="//button[@id='fmSubmit']")
	   WebElement PayNowButton;
	   
	public PaymentPage(WebDriver driver) {
		 this.driver=driver;
	}


	public void clickon_CreditcardButton() {
		 JavaBase.clickOn("CreditCardButton",CreditCardButton,2);
	}
	
	public void Enter_CardNumber(String cardno) {
		 JavaBase.sendKeys("CardNumber",CardNumber,cardno,1);
	}
	
	public void Enter_Cardholdername(String cardholdername) {
		 JavaBase.sendKeys("CardHolderName",CardHolderName,cardholdername,1);
	}
	
	public void Enter_expirymy(String expirym) {
		 JavaBase.sendKeys("ExpiryMY",ExpiryMY,expirym,2);
	}
	
	public void Enter_cvvno(String cvvno) {
		 JavaBase.sendKeys("CVVNumber",CVVNumber,cvvno,2);
	}
	
	public void clickon_PayNowButton() {
		JavaBase.clickOn("PayNowButton",PayNowButton,4);
			
		}
}
