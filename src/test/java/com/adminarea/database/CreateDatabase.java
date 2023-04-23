package com.adminarea.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateDatabase{
	public static void main(String args[])
	{
		try 
		{
			Class.forName("");
			Connection connection=DriverManager.getConnection("");
			System.out.println("Connection Stablish Done" +connection);
	        java.sql.Statement s=connection.createStatement();
           
            ResultSet resultSet=s.executeQuery("SELECT * FROM public.visitors");
            System.out.println("Print table is "+resultSet);
	    	
    	    while (resultSet.next()) {
	    		 System.out.println(resultSet.getInt("id"));
    		     System.out.println(resultSet.getString("first_name"));
	    		 System.out.println(resultSet.getString("last_name"));
	    		 System.out.println(resultSet.getString("mobile_no"));
	    		 System.out.println(resultSet.getString("city_id")); 	 
			}
		
		}
	    	 catch (Exception e) {
				 
		    	 e.printStackTrace();
			}
	    	 

	}
}


