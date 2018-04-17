package week4day1;

//import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import week2day2.ProjectMethods;

public class Excel extends ProjectMethods{

	public static void main() throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./data/TC001.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("No of Rows in TC001 is: "+lastRowNum);
		XSSFRow row = sheet.getRow(0);
		short columnsize = row.getLastCellNum();
		System.out.println(columnsize);
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell = row1.getCell(0);
		String columnvalue = cell.getStringCellValue();
		System.out.println(columnvalue);
		

	}

}
