//package DataDrivenContactUs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import javabase.JavaBase;
//
//public class ContactUsPage {
//	
//	 public WebDriver driver;
//		
//	 @FindBy(linkText="About")
//	 WebElement AboutLink;
//	 
//	 @FindBy(linkText="Contact")
//	  WebElement Contact;
//	 
//	 @FindBy(name="uname")
//	  WebElement User_Name;
//	 
//	 @FindBy(name="email")
//	  WebElement User_Email;
//	 
//	 @FindBy(name="mobile_no")
//	  WebElement Mobile_Number;
//	 
//	 @FindBy(name="content")
//	  WebElement Message;
//	 
//	 @FindBy(xpath="//button[text()='Submit Now']")
//	  WebElement SubmitNowButton;
//
//	// construtor
//		 public ContactUsPage(WebDriver driver) {
//			    this.driver=driver;
//		 }
//		 
//		 public void click_AboutLink() {
//		    	JavaBase.clickOn("AboutLink", AboutLink, 1);
//		}
//		 
//		 public void click_Contact() {
//			 JavaBase.clickOn("Contact",Contact,1);
//		 } 
//
//		 public void Enter_User_Name(String UName) {
//			 JavaBase.sendKeys("User_Name",User_Name, UName,1);;
//		 } 
//
//		 public void Enter_User_Email(String UEmail) {
//			 JavaBase.sendKeys("User_Email",User_Email, UEmail,1);;
//		 } 
//
//		 
//		 public void Enter_User_MobileNo(String UMobileNo) {
//			 JavaBase.sendKeys("Mobile_Number",Mobile_Number, UMobileNo,1);
//		 } 
//		 
//		 public void Enter_Message(String message) {
//			 JavaBase.sendKeys("Message",Message, message,1);
//		 } 
//
//		 public void Click_submitNowButton() {
//			 JavaBase.clickOn("SubmitNowButton",SubmitNowButton,2);
//		 } 
//
//}
