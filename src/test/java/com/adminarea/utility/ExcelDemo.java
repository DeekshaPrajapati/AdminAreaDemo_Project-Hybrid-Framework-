package com.adminarea.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Array;

public class ExcelDemo {

	public static void main(String[] args)  {
		
		String[][] array= ExcelReader.readExcel();
		 for (int i = 0; i <  array.length; i++) {

             for (int j = 0; j < array.length; j++) {
            	 System.out.println(array [i][j]);
             }
		 
		
	}

}
}