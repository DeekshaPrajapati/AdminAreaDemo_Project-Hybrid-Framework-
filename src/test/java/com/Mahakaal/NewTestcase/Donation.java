package com.Mahakaal.NewTestcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mahakaal.extentReport.Extent;
import com.Mahakaal.pages.DonationPage;
import com.Mahakaal.pages.HomePage;
import com.Mahakaal.pages.PaymentPage;
import com.Mahakaal.pages.TextFieldPage;
import com.Mahakaal.utility.PropertyReader;

import com.aventstack.extentreports.Status;

import javabase.JavaBase;

public class Donation extends JavaBase {
	public  Connection connection;
	public DonationPage	 donation ;
	public TextFieldPage textFields;
	public PaymentPage PaymentPay;
	
	@Test(priority=1)
	public void verify_MoneyDonation() throws InterruptedException {
		 HomePage  obj  = PageFactory.initElements(driver, HomePage.class);
		 donation  =PageFactory.initElements(driver,DonationPage.class);
		 textFields =   PageFactory.initElements(driver,TextFieldPage.class);
		 PaymentPay = PageFactory.initElements( driver,PaymentPage.class );
		 
		 driver.get(PropertyReader.getConfigProperty("url"));
	      obj.click_donationLink();	
	      donation.click_donateMoneyLink();
	  		verifyUrl(PropertyReader.getDataProperty( "donateMoneyUrl"));
	  	   textFields.enter_firstName(PropertyReader.getDataProperty("First_Name"));
	       textFields.enter_LastName(PropertyReader.getDataProperty("Last_Name"));
	       donation.enter_FatherName(PropertyReader.getDataProperty("Fath_Name"));
	       donation.enter_MobileNumber(PropertyReader.getDataProperty("MobileNumber"));
	       donation.enter_email(PropertyReader.getDataProperty("Email"));
	       donation.enter_address(PropertyReader.getDataProperty("Address"));
	       donation.enter_country(PropertyReader.getDataProperty("Country"));
	      Thread.sleep(1000);     
	       textFields.state(PropertyReader.getDataProperty("State"));
	       Thread.sleep(2000);
		   textFields.city(PropertyReader.getDataProperty("City"));
		 donation.enter_zipCode(PropertyReader.getDataProperty("ZipCode"));
	     donation.enter_DonationPurpose(PropertyReader.getDataProperty("DoPurpose"));
	     donation.enter_DonationAmount(PropertyReader.getDataProperty("DoAmount"));
	     donation.id_proofType(PropertyReader.getDataProperty("IDProofType"));
	     donation.id_proofnumber(PropertyReader.getDataProperty("IDProofNumber"));
	     donation.enter_PanCardNumber(PropertyReader.getDataProperty("PANCardNumber"));
	     donation.upload_id();
	     Thread.sleep(3000);
	     donation.upload_pic();
	     scrollBardown(300);
	     donation.Click_submitNowButton();
	    // Thread.sleep(4000);
	     verifyUrl(PropertyReader.getDataProperty("PaymentPageUrl"));
	     
	        PaymentPay.clickon_CreditcardButton();
	        verifyUrl(PropertyReader.getDataProperty("CreditCardUrl"));  
			PaymentPay.Enter_CardNumber( PropertyReader.getDataProperty("CardNo")); 
			PaymentPay.Enter_Cardholdername( PropertyReader.getDataProperty("CardHolderN"));
			PaymentPay.Enter_expirymy( PropertyReader.getDataProperty("ExpiryDate")); 
			PaymentPay.Enter_cvvno( PropertyReader.getDataProperty("CVVNo")); 
			PaymentPay.clickon_PayNowButton();
	}

	@Test(priority=2)
	public void connectionSetup()
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://159.65.159.235/mahakal_management_dev_db","postgres","&GCaNNku@7YF");
			System.out.println("Connection Stablish Done---:" +connection);
			 Extent.getTest().log(Status.PASS,"Connection Stablish Success --> "+connection+"Step Passed");
	        }
	    	 catch (Exception e) {
				 e.printStackTrace();
			}
	    	 }
	
	
	
	@Test(priority=3)
	public void validateColumValue() throws SQLException
	{
    	java.sql.Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery("SELECT * FROM public.donations");
        
       System.out.println("Print table is "+resultSet);
        
        
        while (resultSet.next()) {
        	org.testng.Assert.assertEquals(resultSet.getString( "first_name"),"Ayush");
        	 Extent.getTest().log(Status.PASS,"First Name get view in database --> "+resultSet.getString( "first_name"));
   		 //System.out.println(resultSet.getInt("id"));
//		     System.out.println(resultSet.getString("first_name"));
//   		 System.out.println(resultSet.getString("last_name"));
//   		 System.out.println(resultSet.getString("mobile_no"));
//   		 System.out.println(resultSet.getString("city_id")); 	 
		}
}
}