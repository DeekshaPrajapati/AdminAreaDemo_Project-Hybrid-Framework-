package DataDrivenContactUs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mahakaal.pages.ContactUsPage;
import com.Mahakaal.utility.ExcelReader;
import com.Mahakaal.utility.PropertyReader;
import com.Mahakaal.utility.ReadExcelFile;

import javabase.JavaBase;


public class ContactUsTestCases extends JavaBase
{
	
	private static final String[][] data = null;

	@Test(dataProvider="ContactUsdataProvider")	
	public  void  ContactUsTest(String username, String useremail, String mobileno,String message) {
		
		ContactUsPage Contact =PageFactory.initElements(driver,ContactUsPage.class);
		driver.get(PropertyReader.getConfigProperty("url"));
		Contact.click_AboutLink();
		Contact.click_Contact();
		
		Contact.Enter_User_Name( username);
		Contact.Enter_User_Email(useremail);
		Contact.Enter_User_MobileNo(mobileno);
		Contact.Enter_Message(message);
		Contact.Click_submitNowButton();
	}
	
	
	// Spacific data type we can make string int float. we can "Object[][]" type so it can cover all data type value//
	@DataProvider (name="ContactUsdataProvider")
	public Object [][] ContactUsdataProvider(){
		
		//System.out.println(System.getProperty("user.dir"));
				
				Object[][] array= ExcelReader.readExcel();
				return array;

				

}
}