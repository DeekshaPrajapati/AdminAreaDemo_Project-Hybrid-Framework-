package com.adminarea.dataprovider;

import com.adminarea.utility.ExcelReader;

public class DataProvider {
	
	//@DataProvider(name="ContactUsData")
   // public Object[][] getData(){
          Object [][] contactusdata={ExcelReader.readExcel()};
           
    }

//}