package com.Mahakaal.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javabase.JavaBase;

public class DonationPage {
	public WebDriver driver;
	

	@FindBy(xpath="//a[text()='Donate Money Online']")
	WebElement DonationMoneyOnlin;
	
	@FindBy(xpath="//h1[text()='Donate Money']")
	public WebElement DonationTitle; 
	
	@FindBy(name="father_name")
	 WebElement Fathe_Name;
	 
	 @FindBy(name="mobile_no")
	 WebElement Mobile_Number;
	 
	 @FindBy(name="email")
	 WebElement Email;

	 @FindBy(name="address_line_1")
	 WebElement Address;

	 @FindBy(name="country_id")
	 WebElement Country;
	 
	 @FindBy(name="zip_code")
	 WebElement ZipCode;
	 
	 @FindBy(name="donation_purpose_id")
	 WebElement DonationPurpose;
	 
	 @FindBy(name="amount")
	 WebElement DonationAmount;
	 
	 @FindBy(name="id_proof_type_id")
	  WebElement idProffTypeID;
	  
	  @FindBy(name="id_proof_number")
	  WebElement idProofNumber;
	 
	 
	 @FindBy(name="pan_card_no")
	 WebElement PanCard_Number ;
	 
	  @FindBy(xpath="//button[text()='Upload ID Proof']") // //button[text()='Upload An ID Proof']
	  WebElement  uploadIdproof;
	  
	  @FindBy(xpath="//button[text()='Upload Photo']")
	  WebElement uploadPhoto; // //button[text()='Upload A Photo']
	 
	 @FindBy(xpath="//button[@type='btn']") 
	  WebElement submitNowButton;
	  
	// construtor
	 public DonationPage(WebDriver driver) {
		    this.driver=driver;
	 }

	 public void click_donateMoneyLink() {
		 JavaBase.clickBy_javaExcutu(DonationMoneyOnlin, 2 );
		 JavaBase.clickOn("DonationMoneyOnlin",DonationMoneyOnlin,2);
	 }
	 
	 public void enter_FatherName(String FName) {
		 JavaBase.sendKeys("Fathe_Name",Fathe_Name, FName,1);
	 }
	 public void  enter_MobileNumber(String moblie) {
		 JavaBase.sendKeys("Mobile_Number",Mobile_Number, moblie,1);
	 }
	 
	 public void enter_email(String email) {
		 JavaBase.sendKeys("Email",Email, email,1);
	 }
	
	 public void enter_address(String address) {
		 JavaBase.sendKeys("Address",Address, address,1);
		 
	 }
	 
	 public void enter_country(String Con) {
		 JavaBase.sendKeys("Country",Country, Con,5);
	 }
	 
	 public void  enter_zipCode(String zipCode) {
		 JavaBase.sendKeys("ZipCode",ZipCode, zipCode,1);
		 
	 }
	 
	 public void  enter_DonationPurpose(String DonPurpose) {
		 JavaBase.sendKeys("DonationPurpose",DonationPurpose, DonPurpose,2);
		 
	 }

	 public void  enter_DonationAmount(String DonAmount) {
		 JavaBase.sendKeys("DonationAmount",DonationAmount, DonAmount,1);
		 
	 }
	 
	 public void id_proofType(String prooftype) {
	    	JavaBase.sendKeys("idProffTypeID", idProffTypeID,prooftype,1);
	    }
		
	   public void id_proofnumber(String profnum) {
		   JavaBase.sendKeys("idProofNumber",idProofNumber, profnum,1);
	    }
	 
	 public void  enter_PanCardNumber(String PanNumber) {
		 JavaBase.sendKeys("PanCard_Number",PanCard_Number, PanNumber,1);
		 
	 }

	 public void upload_id() {
			Actions actobj =  new Actions(driver);
			actobj.moveToElement(uploadIdproof).click().perform();
			try {
				Runtime.getRuntime().exec("C:\\Users\\Brain\\OneDrive - Brain Above InfoSol Pvt. Ltd\\Desktop\\g1.exe");
			} catch (IOException e) {
				
				e.printStackTrace();
				//Thread.sleep(4000);
			}
		}	
	 
	 public void upload_pic()  {
			Actions actobj =  new Actions(driver);
			  actobj.moveToElement(uploadPhoto).click().perform();
			  try {
				Runtime.getRuntime().exec("C:\\Users\\Brain\\OneDrive - Brain Above InfoSol Pvt. Ltd\\Desktop\\g2.exe");
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
		
		  public void Click_submitNowButton() {
		 JavaBase.clickOn("submitNowButton",submitNowButton,6);
	 } 
	 
	 
}