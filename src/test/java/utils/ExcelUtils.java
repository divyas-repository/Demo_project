package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
		//Constructer to take the excel path and sheet name
	public ExcelUtils(String excelpath, String sheetname) {
		try {
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetname);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void getCellData(int Rownum, int Colnum) {
			
			String value =sheet.getRow(Rownum).getCell(Colnum).getStringCellValue();
			System.out.println(value);
			
			
	}
	public static void getRowCount() {
		try {
			
		
		String projDir = System.getProperty("user.dir");
		System.out.println(projDir);
		
			int Rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows = "+Rowcount );
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
	}
}		


