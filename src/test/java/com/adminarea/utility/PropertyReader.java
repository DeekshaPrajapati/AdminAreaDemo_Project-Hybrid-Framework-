package com.adminarea.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static Properties envProperties_value=new Properties();  // store env=prepod 
	  private static Properties envirment_configStrore=new Properties(); 
	  private static Properties envirment_dataStrore=new Properties(); 
	 static {
		 
		   try {                  // read env value 
			FileInputStream read_env=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//adminarea//properties//env.properties");   						
			                   envProperties_value.load(read_env);  // call load method help with property object 																																																				 
			                
			            
 FileInputStream read_envirmentValue=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//adminarea//properties//"+envProperties_value.getProperty("env")+"-config.properties");                 
			               envirment_configStrore.load(read_envirmentValue);																																														// stg or prepod yaja env key kee value maang raha hain prop or stg aayga aut -config.properties main jakur jo jo key hohee oona ka value read karayga 
		
			                     
			      FileInputStream       read_dataProperties  =new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//adminarea//properties//"+envProperties_value.getProperty("env")+"-data.properties");
			                                       envirment_dataStrore.load(read_dataProperties);
			                 	               
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
		 
	 }
	
public static String getConfigProperty(String key) {
	  return envirment_configStrore.getProperty(key); 
}

public static String getDataProperty(String key) {
	  return envirment_dataStrore.getProperty(key); 
}


}
