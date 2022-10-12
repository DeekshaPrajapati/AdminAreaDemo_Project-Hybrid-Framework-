package com.Mahakaal.testcasesExcution;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mahakaal.pages.DonationPage;
import com.Mahakaal.pages.HomePage;
import com.Mahakaal.pages.TextFieldPage;
import com.Mahakaal.utility.PropertyReader;

import javabase.JavaBase;

public class DonationFullFunctionTestcase extends JavaBase{
				public DonationPage	 donation ;
				public TextFieldPage       textFields;
	
	  @Test(priority=1)
	 public void click_donationLink() {
		 HomePage  obj  = PageFactory.initElements(driver, HomePage.class);
		      obj.click_donationLink();
	 }
	 
	 @Test(priority=2)
	 public void click_donationOnlineMoney() {
		 	donation  =PageFactory.initElements(driver,DonationPage.class);
	          donation.click_donateMoneyLink();
		    
	 }
	 @Test(priority=3)
	 public void enter_addPersonalDatail() {
		       textFields =   PageFactory.initElements(driver,TextFieldPage.class); 
		       
		     //  textFields.enter_firstName(PropertyReader.getDataProperty("First_Name"));
		       textFields.enter_LastName(PropertyReader.getDataProperty("Last_Name"));
		       donation.enter_FatherName(PropertyReader.getDataProperty("Fath_Name"));
		       donation.enter_email(PropertyReader.getDataProperty( "Email"));
		       
	 }
	 
	 @Test(priority=4)
	 public void enter_addAddressDetail() {
		 donation.enter_address(PropertyReader.getDataProperty("Address"));
		 donation.enter_country(PropertyReader.getDataProperty("Country"));
		 textFields.state(PropertyReader.getDataProperty("State"));
		 textFields.city(PropertyReader.getDataProperty("City"));
		 donation.enter_zipCode(PropertyReader.getDataProperty("ZipCode"));
		
		 
	 }
	 
	 @Test(priority=5)
	 public void enter_addOtherDetail() throws InterruptedException {
		 donation.enter_DonationPurpose(PropertyReader.getDataProperty("Donation_Purpose"));
		 donation.enter_DonationAmount( PropertyReader.getDataProperty("Donation_Amount"));
		 donation.upload_id();
		 donation.upload_pic();
	 }
	 
}
