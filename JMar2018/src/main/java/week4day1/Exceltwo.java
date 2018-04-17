package week4day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltwo {

	public Object[][] readExcel() throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./data/TC001.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println("No of Rows in TC001 is: "+rowcount);
		XSSFRow row = sheet.getRow(0);
		short columncount = row.getLastCellNum();
		Object[][] data=new Object[rowcount][columncount];
		System.out.println("No of Columns in TC001 is: "+columncount);
		System.out.println("Row Values");
		System.out.println("***********************");
		for (int j = 1; j <= rowcount; j++) {
			XSSFRow row1 = sheet.getRow(j);
			for (int i = 0; i < columncount; i++) {
				XSSFCell cell = row1.getCell(i);
				String columnvalue = cell.getStringCellValue();
				data[j-1][i]=columnvalue;
				System.out.print(columnvalue + "|");
			} 
			System.out.println();
		}
		return data;
		

	}

}
