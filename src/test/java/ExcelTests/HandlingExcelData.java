package SUMN.SUMN;

public class HandlingExcelData {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sumn\\eclipse-workspace\\SUMN_KV\\src\\test\\java\\SUMN\\SUMN\\Sample.xlsx");
		String sheetname = "test";
		String data = reader.getCellData(sheetname , 0, 2);
		System.out.println(data);
		
		int rowcount = reader.getRowCount(sheetname);
		System.out.println("total rows: "+ rowcount);
		
		
//		reader.addColumn(sheetname, "status");
		
//		reader.addSheet("demo");
		
//		if(! reader.isSheetExist("demo"));
//		{ System.out.println("True"); 
//		}
		
		reader.setCellData(sheetname, "status", 2, "PASS");
		
		
		}

}
