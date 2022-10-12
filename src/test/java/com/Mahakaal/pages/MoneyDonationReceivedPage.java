package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javabase.JavaBase;

public class MoneyDonationReceivedPage {
	
	public WebDriver driver;
	 
	  
	
	  @FindBy(xpath="//a[text()='Money Donation Received']")
	  WebElement MoneyDonationReceived; 

	 @FindBy(name="from_date")
	  WebElement FromDate; 

	 @FindBy(name="to_date")
	  WebElement ToDate;
	 
	 @FindBy(xpath="//*[contains(@type,'btn')]")
	  WebElement LoadButton;
	 

	 public MoneyDonationReceivedPage(WebDriver driver){
	     this.driver=driver;
    } 
	 
	 
	 public void click_MoneyDonationReceived() {
		 JavaBase.clickOn("MoneyDonationReceived",MoneyDonationReceived,2);
	 }
	 public void Select_FromDate(String FDate) {
		 JavaBase.sendKeys("FromDate",FromDate,FDate,2);
	 }

	 public void Select_ToDate(String TDate) {
		 JavaBase.sendKeys("ToDate",ToDate,TDate,2);
	 }

	 public void click_Load() {
		 JavaBase.clickOn("LoadButton",LoadButton,5 );
	 }
}
