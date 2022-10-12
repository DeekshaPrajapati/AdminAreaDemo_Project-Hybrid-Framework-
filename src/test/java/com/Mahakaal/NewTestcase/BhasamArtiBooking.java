package com.Mahakaal.NewTestcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Mahakaal.extentReport.Extent;
import com.Mahakaal.extentReport.ExtentManager;
import com.Mahakaal.pages.AddpaymentDetailPage;
import com.Mahakaal.pages.HomePage;
import com.Mahakaal.pages.PaymentDetailButtonPage;
import com.Mahakaal.pages.PaymentPage;
import com.Mahakaal.pages.PickdateClanderPage;
import com.Mahakaal.pages.TextFieldPage;
//import com.Mahakaal.utility.MyRetry;
import com.Mahakaal.utility.PropertyReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import javabase.JavaBase;

public class BhasamArtiBooking  extends JavaBase{
	
	public TextFieldPage	textfield;
	public	PaymentDetailButtonPage 	paymentdetail;
	public AddpaymentDetailPage	addpaymentdetail;
	public PickdateClanderPage	date;
	public PaymentPage PaymentPay;
	public HomePage home;
	@Test
	//@Test(retryAnalyzer = MyRetry.class)
	public void Check_BhasamArtiBooking() throws InterruptedException 
	{
		   // objects 
		HomePage	home = PageFactory.initElements(driver,HomePage.class);
		PickdateClanderPage	date=PageFactory.initElements(driver,PickdateClanderPage.class);
		textfield=PageFactory.initElements(driver,TextFieldPage.class);
		paymentdetail=PageFactory.initElements(driver,PaymentDetailButtonPage.class);
		addpaymentdetail=PageFactory.initElements(driver,AddpaymentDetailPage.class );
		PaymentPay = PageFactory.initElements( driver,PaymentPage.class );
		
		
		Extent.getTest().log(Status.INFO,"Test Excution Started ");
		Extent.getTest().log(Status.INFO,"Browser Launched --> "+browsersave);
				driver.get(PropertyReader.getConfigProperty("url"));
				String url = driver.getCurrentUrl();
		         Extent.getTest().log(Status.PASS,"Url Opened --> "+url+"Step Passed");
		         
		         verifyUrl(PropertyReader.getDataProperty( "expecturl1"));
		         
		         verifyText(home.welcomeTitle);
		         
				  home.clickOnBhasamArti_Link();
				 
			
					scrollBardown(600);
				//verifyText(date.julyCalender);
				 date.click_ArtiDate();
				 
				scrollBardown(500);
				//scrollByWebElement(textfield.selectCity);
			textfield.enter_firstName(PropertyReader.getDataProperty("First_Name"));
			textfield.enter_LastName(PropertyReader.getDataProperty("Last_Name"));
	       
		    textfield.enter_ContactNumber(PropertyReader.getDataProperty("Contact_Number"));
		    textfield.state(PropertyReader.getDataProperty("State"));
		    Thread.sleep(3000);
			
			textfield.city(PropertyReader.getDataProperty("City"));
			textfield.gender( PropertyReader.getDataProperty("Gender"));
	
			textfield.id_proofType(PropertyReader.getDataProperty("ID_Proof_Type"));	
			textfield.id_proofnumber(PropertyReader.getDataProperty("ID_Proof_Number"));
     		 // uplaod pic
			
				textfield.upload_pic();
				Thread.sleep(3000);
			    textfield.upload_id();
			    scrollBardown(200);
			 
			    
				textfield.clickOnSubmit();
				
		//verifyUrl(PropertyReader.getDataProperty( "expecturl2"));	
				scrollBardown(400);
				paymentdetail.click_PaymentDetailBtn();
				 
				addpaymentdetail.Enter_FirstName(PropertyReader.getDataProperty("First_Name"));
				addpaymentdetail.enter_LastName( PropertyReader.getDataProperty("Last_Name"));
				addpaymentdetail.enter_ContactNumber( PropertyReader.getDataProperty("Contact_Number"));
				addpaymentdetail.enter_Email( PropertyReader.getDataProperty("Email"));
				addpaymentdetail.enter_Address(PropertyReader.getDataProperty("Address"));
				addpaymentdetail.clickon_ProceedPaymentBtn();	
		
				PaymentPay.clickon_CreditcardButton();
				PaymentPay.Enter_CardNumber( PropertyReader.getDataProperty("CardNo")); 
				PaymentPay.Enter_Cardholdername( PropertyReader.getDataProperty("CardHolderN"));
				PaymentPay.Enter_expirymy( PropertyReader.getDataProperty("ExpiryDate"));
				
				PaymentPay.Enter_cvvno( PropertyReader.getDataProperty("CVVNo")); 
				Thread.sleep(3000);
				PaymentPay.clickon_PayNowButton();
	
	}
	

}
