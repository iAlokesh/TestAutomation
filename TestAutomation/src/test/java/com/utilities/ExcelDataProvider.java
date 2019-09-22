package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
	
	public String getDataFromTestcasePriority(String sheetName, String columnName, int rowNumber) {
		XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int col_num = -1;
        for(int i=0; i < row.getLastCellNum(); i++)
        {
            if(row.getCell(i).getStringCellValue().trim().equals(columnName))
                col_num = i;
        }
        row = sheet.getRow(rowNumber-1);
        XSSFCell cell = row.getCell(col_num);
        String value = cell.getStringCellValue();
        System.out.println("Value of the Excel Cell is - "+ value);
		return value;
	}
}
