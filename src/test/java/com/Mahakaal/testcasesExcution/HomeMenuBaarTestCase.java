package com.Mahakaal.testcasesExcution;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mahakaal.pages.HomePage;
import com.Mahakaal.utility.PropertyReader;

import javabase.JavaBase;

public class HomeMenuBaarTestCase  extends JavaBase{
	public HomePage  obj;
	
//	@Test(priority=1)
//	public void openUrl()  {
//		  JavaBase.openUrl(PropertyReader.getConfigProperty("url"));
//		 
//	}
	
@Test(priority = 1)
public void check_InformationLink() {
	obj=PageFactory.initElements(driver, HomePage.class);
	obj.click_InformationLink();
}



@Test(priority=2)
public void check_AboutLink() {
	obj.click_AboutLink();
				
}

@Test(priority = 3)
   public void check_HomeLink() {
	      obj.click_HomeLink();
   }

public void check_BhasamArtiLink() {
	obj.clickOnBhasamArti_Link();
}



//
//  
//	
	
	

	
	
	
	
}
