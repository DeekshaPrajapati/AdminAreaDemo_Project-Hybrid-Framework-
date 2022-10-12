package com.Mahakaal.testcasesExcution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Mahakaal.pages.AddpaymentDetailPage;
import com.Mahakaal.pages.HomePage;
import com.Mahakaal.pages.PaymentDetailButtonPage;
import com.Mahakaal.pages.PickdateClanderPage;
import com.Mahakaal.pages.TextFieldPage;
import com.Mahakaal.utility.PropertyReader;
import com.aventstack.extentreports.Status;

import javabase.JavaBase;

public class BhasamArtiBookingTestcases extends JavaBase
{
	public TextFieldPage	text;
	public	PaymentDetailButtonPage 	paymentdetail;
	public AddpaymentDetailPage	addpaymentdetail;
	public PickdateClanderPage	date;
	
	
	@Test(priority=1)
	public void openUrl() {
		 driver.get(PropertyReader.getConfigProperty("url"));
		
 			
	}

@Test(priority=2)
public void click_BhasamArtiLink() {
HomePage	home = PageFactory.initElements(driver,HomePage.class);
             home.clickOnBhasamArti_Link();
             
           //log.info("Clicked on Bhasam Aarti Booking link and navigated to calenderPage");
        
           	
}
	
@Test(priority=3)
public void pickdate_FromClander()
{
	PickdateClanderPage	date=PageFactory.initElements(driver,PickdateClanderPage.class);
	
	//scrollBardown(500);  
	//log.info(" clicked on Arti date and Navigated to user information detail page ");
}
	
//	@Test(priority=4)
public void enter_TextFieldInfo()  {
	text=PageFactory.initElements(driver,TextFieldPage.class);
//	text.enter_firstName(PropertyReader.getDataProperty("First_Name"));	
//	text.enter_LastName(PropertyReader.getDataProperty("Last_Name"));
//	text.enter_ContactNumber(PropertyReader.getDataProperty("Contact_Number"));
//	text.state(PropertyReader.getDataProperty("State"));
//	text.city(PropertyReader.getDataProperty("City"));
//	text.gender( PropertyReader.getDataProperty("Gender"));
//	log.info("Enter data in FirstName,LastName,ContactNumber,State City and gender");
}
//	
//	@Test(priority=5)
//	public void enterProfTypeAndNumber() {
//		text.id_proofType(PropertyReader.getDataProperty("ID_Proof_Type"));	
//		text.id_proofnumber(PropertyReader.getDataProperty("ID_Proof_Number"));
//		log.info("Entered Id proof type and Id proof number" );
//	}
//	
//	
//	@Test(priority=6)
//	 public void uploadPic() {
//		text.upload_pic();
//		log.info("Userpic uploaded");
//	 }
//	
//	
//	@Test(priority=7)
//	 public void upload_id() {
	
//		 text.upload_pic();
//		 log.info("User id uploaded");
//	 }
//	
//	 
//	@Test(priority=8) 
//	 public void click_submitButton() {
//		JavaBase.scrollBardown(200);
//		log.info("Page scrolled");
//		 text.clickOnSubmit();
//		 log.info(" Clicked on Submit button");
//	 }
//	
//	
//	@Test(priority=9)
//public void  click_PayamentDetaillButton() {
//	paymentdetail=PageFactory.initElements(driver,PaymentDetailButtonPage.class);	 // page class object and send driver .so driver incilze thre and here object create , so we can call method 
//			
//	paymentdetail.click_PaymentDetailBtn();
//	log.info("Clicked on PaymentDetail button");
//}
//	@Test(priority=10)
//	public void enterPaymentDeatils() {
//	addpaymentdetail=PageFactory.initElements(driver,AddpaymentDetailPage.class);	 // page class object so we use call method
//		  
//		 addpaymentdetail.addpaymentDetail(PropertyReader.getDataProperty("First_Name"),
//				 PropertyReader.getDataProperty("Last_Name"),
//			 PropertyReader.getDataProperty("Contact_Number"), 
//				 PropertyReader.getDataProperty("email"),
//				 PropertyReader.getDataProperty("address"));
//		 log.info("Entered data  in FirstName, LastNAme,contactNumber.Email,Address");
//		 
//	}
//@Test(priority=11)
//public void click_proceedPaymentBtn() {
//	 addpaymentdetail.clickon_ProceedPaymentBtn();
//   log.info(" Clicked on Proceed Payment button ");
//}
//
//

}
