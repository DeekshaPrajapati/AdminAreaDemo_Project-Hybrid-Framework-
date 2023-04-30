package com.datadriven.testing;

public class TestExcel {
	
	public static void main(String[] args) {
		   String [][]  array   = ExcelReader.readExcel();
	   System.out.println(array.length);
		   
			 for (int i = 0; i < 51; i++) {

	             for (int j = 0; j < 4; j++) {
	            	 System.out.println(array [i][j]);
	             }   
		   
		   
		   
			 }	  
		   
		   
	}

}
