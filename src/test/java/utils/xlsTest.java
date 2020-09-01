package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsTest {
	
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	
		//Constructer to take the excel path and sheet name
	public xlsTest(String excelpath, String sheetname) {
		
		
		try {
		InputStream file=new FileInputStream(excelpath);
		
		workbook = new HSSFWorkbook(new POIFSFileSystem(file));
		
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



