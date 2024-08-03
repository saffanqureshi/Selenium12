package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllValueFromExcel {

	public static void main(String[] args) throws IOException {
		// Open Workbook - Create object of XSSFWorkbook class
				XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
				// get into the sheet
				XSSFSheet sheet = wb.getSheet("Sheet1");
					//Get Row count
					int rowCount = sheet.getLastRowNum();
					//System.out.println(rowCount);
					// Get Column Count
					int columnCount = sheet.getRow(0).getLastCellNum();
					System.out.println(columnCount);
					for (int i = 1; i <= rowCount; i++) {
						// get into the row
						XSSFRow row = sheet.getRow(i);
						for (int j = 0; j < columnCount; j++) {
							//get into the column
							XSSFCell cell = row.getCell(j);
							//Print all value from excel sheet  
							String cellValue = cell.getStringCellValue();
							System.out.println(cellValue);
						}// End of column count loop
					}//End of row count loop
	}

}
