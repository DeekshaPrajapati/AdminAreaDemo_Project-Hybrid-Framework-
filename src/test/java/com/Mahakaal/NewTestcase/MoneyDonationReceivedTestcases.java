package com.Mahakaal.NewTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.Mahakaal.pages.HomePage;
import com.Mahakaal.pages.MoneyDonationReceivedPage;
import com.Mahakaal.utility.PropertyReader;

import javabase.JavaBase;

public class MoneyDonationReceivedTestcases extends JavaBase
{
	public MoneyDonationReceivedPage Received ;
	
	@Test(priority=1)
	 public void MoneyDonationReceived() {
		 HomePage  obj  = PageFactory.initElements(driver, HomePage.class);
		 MoneyDonationReceivedPage Received = PageFactory.initElements(driver, MoneyDonationReceivedPage.class);
	 
		      driver.get(PropertyReader.getConfigProperty("url"));
	
		      obj.click_donationLink();	
		      Received.click_MoneyDonationReceived();
		      Received.Select_FromDate(PropertyReader.getDataProperty("fromedate"));	
			  Received.Select_ToDate(PropertyReader.getDataProperty("Todate"));
			  Received.click_Load();
		      
	}
	
  }