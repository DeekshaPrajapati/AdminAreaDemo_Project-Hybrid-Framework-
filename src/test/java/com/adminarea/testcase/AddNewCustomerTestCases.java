package com.adminarea.testcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adminarea.extentreport.Extent;
import com.adminarea.pages.AddNewCustomerPage;
import com.adminarea.utility.PropertyReader;
import com.aventstack.extentreports.Status;

import javabase.JavaBase;

public class AddNewCustomerTestCases extends JavaBase {

	public  Connection connection;	
	public AddNewCustomerPage addcustomer ;
	public WebDriver driver;
	
	
	@Test(priority=1)
	 public void ClickCustomerMenu() {
		Extent.getTest().log(Status.INFO,"User click on customer menu button");
		driver=JavaBase.getDriver(); 
		addcustomer = PageFactory.initElements(driver, AddNewCustomerPage.class);
	 
		      driver.get(PropertyReader.getConfigProperty("urlcustomer"));
	
		      addcustomer.clickOnCustomersMenu();
		     
}
	@Test(priority=2)
	public void ClickOnCustomerMenuItem() {
		Extent.getTest().log(Status.INFO,"User click on customer menu item");
		addcustomer.ClickOn_CustomerMenuItem();
		
	}
	
	@Test(priority=3)
	public void UserClickOn_AddNewButton() {
		Extent.getTest().log(Status.INFO,"User click on add new button");
		addcustomer.clickOn_AddNewButton();
	}
	
	@Test(priority=4)
	public void validate_user_can_view_add_new_customer_page() {
		
		String actualTitle = addcustomer.driver.getTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{
			
			Extent.getTest().log(Status.INFO,"User can view Add new customer page- passed");
			Assert.assertTrue(true);//pass
		}
		else
		{
			
			Extent.getTest().log(Status.INFO,"User can view Add new customer page- failed");
			Assert.assertTrue(false);//fail
		}
	}
	
	@Test(priority=5)
	public void User_EnterEmail() {
		Extent.getTest().log(Status.INFO,"User enter email address");
		addcustomer.Enter_Email();
	}
	
	@Test(priority=6)
     public void User_EnterPassword() {
		Extent.getTest().log(Status.INFO,"User enter password");
		addcustomer.Enter_Password();
	}
	
	@Test(priority=7)
	public void User_EnterFirstName() {
		Extent.getTest().log(Status.INFO,"User enter first name");
		addcustomer.Enter_FirstName();
	}
	
	@Test(priority=8)
	public void User_EnterLastName() {
		Extent.getTest().log(Status.INFO,"User enter last name");
		addcustomer.Enter_LastName();
	}
	
	@Test(priority=9)
	public void Select_Gender() {
		Extent.getTest().log(Status.INFO,"User choose a gender");
		addcustomer.select_gender();
	}
	
	@Test(priority=10)
	public void User_EnterDOB() {
		Extent.getTest().log(Status.INFO,"User enter date of birth");
		addcustomer.Enter_DOB();
	}
	
	@Test(priority=11)
	public void User_Enter_CompanyName() {
		Extent.getTest().log(Status.INFO,"User enter company name");
		addcustomer.Enter_CompanyName();
	}
	
	@Test(priority=12)
	public void UserSelect_CustomerRole() {
		Extent.getTest().log(Status.INFO,"User select customer role");
		addcustomer.Select_CustomerRole();
	}
	
	@Test(priority=13)
	public void UserScroll_Page() {
		Extent.getTest().log(Status.INFO,"User scrolling a page from top to bottom");
		addcustomer.Scroll_BarDown();
	}
	
	@Test(priority=14)
	public void UserEnter_AdminComment() {
		Extent.getTest().log(Status.INFO,"User descrive a admin content");
		addcustomer.Enter_AdminComment();
	}
	
	@Test(priority=15)
	public void UserClick_OnSaveButton() {
		Extent.getTest().log(Status.INFO,"User click on save button");
		addcustomer.ClickOnSave_Button();
	}

	@Test(priority=16)
	public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {
		
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(exptectedConfirmationMsg))
		{
			Assert.assertTrue(true);//pass
			Extent.getTest().log(Status.INFO,"User can view confirmation message - passed");
			

		}
		else
		{
			
			Extent.getTest().log(Status.INFO,"User can view confirmation message - failed");
			Assert.assertTrue(false);//fail

		}

}
	
//	@Test(priority=17)
//	public void DataBase_ConnectionSetup()
//	{
//		try 
//		{
//			Class.forName("com.mysql.jdbc.Driver");
//  		    connection =DriverManager.getConnection(PropertyReader.getConfigProperty("DB_URL"),PropertyReader.getConfigProperty("DB_USER"),PropertyReader.getConfigProperty("DB_PASS"));
//			System.out.println("Connection Stablish Done---:" +connection);
//			 Extent.getTest().log(Status.PASS,"Connection Stablish Success --> "+connection+"Step Passed");
//	        }
//	    	 catch (Exception e) {
//				 e.printStackTrace();
//			}
//	    	 }
	
	@Test(priority=18)
	public void User_ClickOn_LogoutBtn() {
		addcustomer.ClickOnLogout_Button();
	}
	
//	@Test(priority=18)
//	public void validateColumValue() throws SQLException
//	{
//    	java.sql.Statement s=connection.createStatement();
//        ResultSet resultSet=s.executeQuery("SELECT * FROM public.customer");
//        
//       System.out.println("Print table is "+resultSet);
//        
//        
//        while (resultSet.next()) {
//        	org.testng.Assert.assertEquals(resultSet.getString( "first_name"),"Ayush");
//        	 Extent.getTest().log(Status.PASS,"First Name get view in database --> "+resultSet.getString( "first_name"));
   		 //System.out.println(resultSet.getInt("id"));
//		     System.out.println(resultSet.getString("first_name"));
//   		 System.out.println(resultSet.getString("last_name"));
//   		 System.out.println(resultSet.getString("mobile_no"));
//   		 System.out.println(resultSet.getString("city_id")); 	 
		//}
//}
}