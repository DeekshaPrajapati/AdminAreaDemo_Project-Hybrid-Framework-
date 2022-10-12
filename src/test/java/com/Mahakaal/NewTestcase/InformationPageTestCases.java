package com.Mahakaal.NewTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mahakaal.pages.HomePage;
import com.Mahakaal.pages.InformationPage;
import com.Mahakaal.utility.PropertyReader;

import javabase.JavaBase;

public class InformationPageTestCases extends JavaBase
  {
	public InformationPage Info;
	
	@Test
	public void InformationSubMenu() {
		InformationPage Info = PageFactory.initElements(driver,InformationPage.class);
		driver.get(PropertyReader.getConfigProperty("url"));
		
		Info.clickOnInformatioLink();
		Info.clickOnEPass();
		Info.clickOnDharmshala();
		Info.clickOnAnnakshetra();
		Info.clickOnBhasmAarati();
		Info.clickOnPujaAbhishek();
		Info.clickOnImportantDays();
		Info.clickOnUjjainCity();
		Info.clickOnHistory();
		Info.clickOnPlacetoVisit();
		Info.clickOnHowtoReach();
		Info.clickOnAccommodation();
		
	}
	
	
  }