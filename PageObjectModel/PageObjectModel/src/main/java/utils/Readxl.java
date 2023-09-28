package utils;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.BaseClass;

public class Readxl extends BaseClass {

	public static String[][] ReadExcel(String excelFileName, String sheetName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = eachRow.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		wb.close();
		return data;
	}

}
