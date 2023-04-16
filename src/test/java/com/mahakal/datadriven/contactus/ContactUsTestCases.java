//package com.mahakal.datadriven.contactus;
//
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.Mahakaal.pages.ContactUsPage;
//import com.Mahakaal.utility.PropertyReader;
//import com.Mahakaal.utility.ReadExcelFile;
//
//import javabase.JavaBase;
//
//
//public class ContactUsTestCases extends JavaBase
//{
//	
//	ContactUsPage Contact =PageFactory.initElements(driver,ContactUsPage.class);
//	
//	@DataProvider(name="ContactUs")
//	public Object[][] getData(){
//		String[][] ContactUsdataProvider = ExcelReader.readExcel();
//		return ContactUsdataProvider;
//		
//	}
//	
//	@Test(dataProvider="ContactUs")	
//	public void ContactUsTest(String username, String useremail, String mobileno,String message) {
//		
//		Contact.click_AboutLink();
//		Contact.click_Contact();
//		Contact.Enter_User_Name( username);
//		Contact.Enter_User_Email(useremail);
//		Contact.Enter_User_MobileNo(mobileno);
//		Contact.Enter_Message(message);
//		Contact.Click_submitNowButton();
//	}
//	
//	
////	@DataProvider (name="ContactUsdataProvider")
////	public String[][] ContactUsdataProvider(){
////		
////		//System.out.println(System.getProperty("user.dir"));
////				String fileName = System.getProperty("user.dir") + "\\TestData\\ContactUs.xlsx";
////
////
////				int ttlRows = ReadExcelFile.getRowCount(fileName, " ContactTestData");
////				int ttlColumns = ReadExcelFile.getColCount(fileName, " ContactTestData");
////			
////
////				String data[][]=new String[ttlRows-1][ttlColumns];
////
////				for(int i=1;i<ttlRows;i++)//rows =1,2
////				{
////					for(int j=0;j<ttlColumns;j++)//col=0, 1,2
////					{
////
////						data[i-1][j]=ReadExcelFile.getCellValue(fileName,"ContactTestData", i,j);
////					}
////
////				}
////				return data;
////			
//		
//		
//	}
//
//
