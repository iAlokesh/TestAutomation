package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;;;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File file = new File ("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getData(String sheetName, int rowNo, int cellNo) {
		return wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
}
