package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javabase.JavaBase;

public class AboutPage 
{
	public WebDriver driver;
	 
	 
	 @FindBy(linkText="History")
	  WebElement History;

	 @FindBy(linkText="Temple")
	  WebElement Temple;

	 @FindBy(linkText="Aarti Videos")
	  WebElement Aarti_Videos;

	 @FindBy(linkText="Temple Trustees")
	  WebElement Temple_Trustees;

	 @FindBy(linkText="Purohit/Pujari")
	  WebElement Purohit_Pujari;
	 
	 @FindBy(linkText="Contact")
	  WebElement Contact;
	 
	 @FindBy(linkText="Suggestions")
	  WebElement Suggestions;
	 
	 public AboutPage(WebDriver driver){
	     this.driver=driver;
	 }
	     public void click_History() throws InterruptedException {
			 JavaBase.clickOn("History",History,1);
			 Thread.sleep(3000);
		 }   
	 
	     public void click_Temple() {
			 JavaBase.clickOn("Temple",Temple,1);
		 } 

	     public void click_AartiVideo() {
			 JavaBase.clickOn("Aarti_Videos",Aarti_Videos,1);
		 } 
	 
	     public void click_TempleTrust() {
			 JavaBase.clickOn("Temple_Trustees",Temple_Trustees,1);
		 } 
	 
	     public void click_PurohitPujari() {
			 JavaBase.clickOn("Purohit_Pujari",Purohit_Pujari,1);
		 } 

	     public void click_Contact() {
			 JavaBase.clickOn("Contact",Contact,1 );
		 } 

	     public void click_Suggestions() {
			 JavaBase.clickOn("Suggestions",Suggestions,1);
		 }
}
