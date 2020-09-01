package utils;

public class ExcelUtilstest {
	
	public static void main(String[] args) {
		
		String projDir = System.getProperty("user.dir");
		
		String excelpath= projDir + "/Data/Data.xlsx";
		System.out.println("excelpath " + excelpath);
		
		String sheetname= "sheet1";
		ExcelUtils utils=new ExcelUtils(excelpath, sheetname);
		
		
		utils.getRowCount();
        utils.getCellData(3, 0);
        utils.getCellData(3, 1);
        	
	}
}
