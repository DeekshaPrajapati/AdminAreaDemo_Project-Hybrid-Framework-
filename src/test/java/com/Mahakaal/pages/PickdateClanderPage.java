package com.Mahakaal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javabase.JavaBase;

public class PickdateClanderPage {
	
	public WebDriver driver;
	
   @FindBy(xpath="//span[text()='24']")
	public WebElement pickdate;
   
   @FindBy(xpath="//h3[text()='August 2022']")
	public WebElement julyCalender;
   
   @FindBy(xpath="//a[text()='Privacy Policy']")
   public  WebElement privacyPolicy;

//	  @FindBy(xpath="//div[text()=' Next ']")
//	  WebElement NextBtn;
	
//	 @FindBy(xpath="/html/body/app-root/app-bhasmarti/app-registration-form/div/div/div[4]/div/div/mwl-calendar-month-view/div/div/div[1]/div/mwl-calendar-month-cell[5]/div/div[1]/span") 
//	   WebElement date2;

	public PickdateClanderPage(WebDriver driver){
	     this.driver=driver;
}
	
	
	public void click_ArtiDate()  {
		
	    JavaBase.clickBy_javaExcutu(pickdate, 2);
		// JavaBase.clickOn("pickdate",pickdate,2);
	//	JavaBase.scrollByWebElement(pickdate);
		
	}
	// assert verify url 


//	public void click_nextButton() {
//	    JavaBase.clickOn(NextBtn);
//}
	
//	public void click_July2nd() {
//		date2.click();
//		//JavaBase.clickOn(date2);
//	}
}