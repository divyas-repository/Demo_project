package utils;

public class xlsRun {
	
	public static void main(String[] args) {
		
		String projDir = System.getProperty("user.dir");
		
		String excelpath= projDir + "/Data/Data.xls";
		System.out.println("excelpath " + excelpath);
		
		String sheetname= "sheet1";
		 xlsTest utils1 =new xlsTest(excelpath, sheetname);
		
		
		utils1.getRowCount();
        utils1.getCellData(3, 0);
        utils1.getCellData(3, 1);
        	
	}
}

