package com.adminarea.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adminarea.utility.PropertyReader;

import javabase.JavaBase;


//////////////////////////// Add New Customer /////////////////////////////////////////

public class AddNewCustomerPage {

	
	public WebDriver driver;
	
	//Find web elements on the web page
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")	 
	WebElement lnkCustomers_menu;

	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement lnkCustomers_menuitem;

	@FindBy(xpath = "//a[@class='btn btn-primary']")	 
	WebElement btnAddnew;


	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;


	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement txtCustomerRoles;


	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	WebElement listItemAdministrators;


	@FindBy(xpath = "//li[contains(text(),'Registered')]")
	WebElement listItemRegistered;

	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	WebElement listItemGuests;


	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	WebElement listItemVendors;
	//VendorId

	@FindBy(xpath = "//*[@id='VendorId']")
	WebElement dropdownVendorMgr;

	@FindBy(id = "Gender_Male")
	WebElement MaleGender;


	@FindBy(id = "Gender_Female")
	WebElement FeMaleGender;


	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;


	@FindBy(xpath = "//input[@id='LastName']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement txtDob;

	@FindBy(xpath = "//input[@id='Company']")
	WebElement txtCompanyName;

	@FindBy(xpath = "//textarea[@id='AdminComment']")
	WebElement txtAdminContent;

	@FindBy(xpath = "//button[@name='save']")
	WebElement btnSave;
	
	
	 public AddNewCustomerPage(WebDriver driver){
	     this.driver=driver;
    } 
	 
	 public void clickOnCustomersMenu() {
			JavaBase.clickOn(lnkCustomers_menu, 20);
		}
	 
	 public void ClickOn_CustomerMenuItem() {
		 
		 JavaBase.clickBy_javaExcutu(lnkCustomers_menuitem, 20);
	 }

	public void clickOn_AddNewButton() {
		JavaBase.clickOn(btnAddnew, 0);
	}
	
	public void Enter_Email() {
		JavaBase.sendkeys(txtEmail, 20, PropertyReader.getDataProperty("email"));
	}
	
	
	public void Enter_Password() {
		JavaBase.sendkeys(txtPassword, 20, PropertyReader.getDataProperty("password"));
	}
	
	public void Enter_FirstName() {
		JavaBase.sendkeys(txtFirstName, 0, PropertyReader.getDataProperty("firstName"));
	}
	
	public void Enter_LastName() {
		JavaBase.sendkeys(txtLastName, 0, PropertyReader.getDataProperty("lastName"));
	}
	
	public void select_gender() {
		if(MaleGender.equals("Male"))
		{
			MaleGender.click();
		}
		else if(FeMaleGender.equals("Female"))
		{
			FeMaleGender.click();
		}
		else//default set Male gender
		{
			MaleGender.click();
		}
	}
	
	public void Enter_DOB() {
		JavaBase.sendkeys(txtDob, 0, PropertyReader.getDataProperty("DOB"));
	}
	
	
	public void Enter_CompanyName() {
		JavaBase.sendkeys(txtCompanyName, 0, PropertyReader.getDataProperty("CompanyName"));
	}
	
	public void Select_CustomerRole() {
		JavaBase.sendkeys(txtCustomerRoles, 0, PropertyReader.getDataProperty("Role"));
	}
	
	public void Scroll_BarDown() {
		JavaBase.scrollDown(500);
	}
	
	public void Enter_AdminComment() {
		JavaBase.sendkeys(txtAdminContent, 0, PropertyReader.getDataProperty("Comment"));
	}
	
	public void ClickOnSave_Button() {
		JavaBase.clickOn(btnSave, 0);
	}

}
