package com.adminarea.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentManager 
{
	
static public  ExtentSparkReporter  htmlReporter;
static public  ExtentReports reports;
static public	 ExtentTest test;


private ExtentManager()
{
	
}
		 
public synchronized static ExtentReports getExtentReportsInstance()
{
if(reports==null)
{
htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\Admin_Area_Demo.html");   
htmlReporter.config().setReportName("AdminArea"); 
htmlReporter.config().setDocumentTitle("Admin_Area_Demo_Project"); 
htmlReporter.config().setTheme(Theme.DARK);
reports=new ExtentReports(); 
reports.setSystemInfo("Operating System", "Windows 11");
reports.setSystemInfo("Tested By", "Deeksha Prajapati");
reports.setSystemInfo("Browser:","chrome");
reports.attachReporter(htmlReporter);
return reports;

}
else
{
return reports;	
}
}
	
	

}
