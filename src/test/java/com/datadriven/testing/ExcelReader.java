package com.datadriven.testing;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

	public class ExcelReader {

	    public static String[][] readExcel() {
	        String[][] data =null;// store excel row data
	        try {
	            FileInputStream fileIn = new FileInputStream(System.getProperty("user.dir")+"//TestData//LoginData.xlsx");
	            XSSFWorkbook wb = new XSSFWorkbook(fileIn);
	            XSSFSheet sheet = wb.getSheetAt(0);
	          
	            int rowcount = sheet.getPhysicalNumberOfRows();
	            
	            int colmn = sheet.getRow(0).getLastCellNum();
	          data= new String[rowcount - 1][colmn];
	            for (int i = 0; i < rowcount - 1; i++) {

	                for (int j = 0; j < colmn; j++) {
	                    DataFormatter df = new DataFormatter();
	                    
	                    data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
	                    //System.out.println(data[i][j]);                                                                // do want header part 0+1=1 row 
	                }
	            }
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        return data;
	    }
	}


