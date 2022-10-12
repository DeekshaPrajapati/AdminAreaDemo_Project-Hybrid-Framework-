package com.Mahakaal.NewTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mahakaal.pages.HomePage;
//import com.Mahakaal.testcasesExcution.HomeMenuBaarTestCase;
import com.Mahakaal.utility.PropertyReader;

import javabase.JavaBase;

public class HomePageTestCases extends JavaBase
{
    //public void MenuBar;
	@Test
	public void HomeMenuBar() {
		
		HomePage MenuBar= PageFactory.initElements(driver, HomePage.class);
		
		driver.get(PropertyReader.getConfigProperty("url"));
		MenuBar.click_AboutLink();
		MenuBar.clickOnBhasamArti_Link();
		MenuBar.click_InformationLink();
		MenuBar.click_donationLink();
	}

}
