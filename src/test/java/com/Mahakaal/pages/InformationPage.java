package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javabase.JavaBase;

public class InformationPage 
{
	 public WebDriver driver;
	 
	    @FindBy(linkText="Information")
		WebElement information;

	    @FindBy(xpath="//a[text()='Download E-Pass']")
		WebElement DownloadEPass;
	    
	    @FindBy(xpath="//a[text()='Dharmshala']")
		WebElement Dharmshala;

	    @FindBy(xpath="//a[text()='Annakshetra']")
		WebElement Annakshetra ;
	    
	    @FindBy(xpath="//a[text()='Bhasm Aarati']")
		WebElement BhasmAarati;
	    
	    @FindBy(xpath="//a[text()='Puja/Abhishek']")
		WebElement PujaAbhishek;
	    
	    @FindBy(xpath="//a[text()='Important Days']")
		WebElement ImportantDays;
	    
	    @FindBy(xpath="//a[text()='Ujjain City']")
		WebElement UjjainCity;
	    
	    @FindBy(xpath="")
		WebElement History;
	    
	    @FindBy(xpath="//a[text()='Places to Visit']")
		WebElement PlacetoVisit;
	    
	    @FindBy(xpath="//a[text()='How to Reach?']")
		WebElement HowtoReach;
	    
	    @FindBy(xpath="//a[text()='Accommodation']")
		WebElement Accommodation;
	    
	 // construtor
		public InformationPage(WebDriver driver){
		     this.driver=driver;
	 }
		public void clickOnInformatioLink() {
			JavaBase.clickOn("information",information,1);
		}
	    
		public void clickOnEPass() {
			JavaBase.clickOn("DownloadEPass",DownloadEPass,1);
		}
		
		public void clickOnDharmshala() {
			JavaBase.clickOn("Dharmshala",Dharmshala,1);
		}
	   
		public void clickOnAnnakshetra() {
			JavaBase.clickOn("Annakshetra", Annakshetra,1);
		}

		public void clickOnBhasmAarati() {
			JavaBase.clickOn("BhasmAarati",BhasmAarati,1 );
		}
		
		public void clickOnPujaAbhishek() {
			JavaBase.clickOn("PujaAbhishek",PujaAbhishek,1);
		}
		
		public void clickOnImportantDays() {
			JavaBase.clickOn("ImportantDays", ImportantDays,1);
		}

		
		public void clickOnUjjainCity() {
			JavaBase.clickOn("UjjainCity",UjjainCity,1);
		}

		public void clickOnHistory() {
			JavaBase.clickOn("History", History,1);
		}

		public void clickOnPlacetoVisit() {
			JavaBase.clickOn("PlacetoVisit",PlacetoVisit,1);
		}
		
		public void clickOnHowtoReach() {
			JavaBase.clickOn("HowtoReach" ,HowtoReach,1);
		}
	
		public void clickOnAccommodation() {
			JavaBase.clickOn("Accommodation",Accommodation,1);
		}
}
