package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


// How to read a particular value from a excel sheet
public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
// Open Workbook - Create object of XSSFWorkbook class
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		// get in the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		// get in the row
		XSSFRow row = sheet.getRow(5);
		//get into the column
		XSSFCell cell = row.getCell(2);
		//Print or read a particular cell value by using getStringCellValue method and store it in cellValue variable 
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
	}

}
