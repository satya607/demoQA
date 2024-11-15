package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutil {
	 public String readEcelData(String sheetname,int rowno,int cellno) throws Throwable {
	    	FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 2.xlsx");
	    	Workbook wb = WorkbookFactory.create(fis);
	    	String value = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
	    	wb.close();
	    	return value;
}
}