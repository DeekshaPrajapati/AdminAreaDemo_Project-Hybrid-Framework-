package com.adminarea.databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import javabase.JavaBase;

public class VisitorsDataTable extends JavaBase{
	
	public  Connection connection;
	
	@Test(priority=1)
	public void connectionSetup()
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://159.65.159.235/mahakal_management_dev_db","postgres","&GCaNNku@7YF");
			System.out.println("Connection Stablish Done---:" +connection);
	        }
	    	 catch (Exception e) {
				 e.printStackTrace();
			}
	    	 }
	
	
	
	@Test(priority=2)
	public void validateColumValue() throws SQLException
	{
    	java.sql.Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery("SELECT * FROM public.visitors");
       
        
        System.out.println("Print table is "+resultSet);
        
        while (resultSet.next()) {
        	org.testng.Assert.assertEquals(resultSet.getString( "id"),2072 );
   		 //System.out.println(resultSet.getInt("id"));
//		     System.out.println(resultSet.getString("first_name"));
//   		 System.out.println(resultSet.getString("last_name"));
//   		 System.out.println(resultSet.getString("mobile_no"));
//   		 System.out.println(resultSet.getString("city_id")); 	 
		}
        
	}
//    @Test(priority=2)
//	public void checkTablePresent() 
//	{
//    	
//	}
//	
//    
//    
//	
//    @Test(priority=3)
//	public void validateHowmanyRows()
//	{
//		
//	}
//    
//    @Test(priority=4)
//	public void validateHowmanyColumn()
//	{
//		
//	}
//	
//    
//    @Test(priority=5)
//	public void clocedatabaseConnection()
//	{
//		
//	}
    
}


