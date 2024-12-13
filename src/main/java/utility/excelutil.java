package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
	 public String readEcelData(String sheetname,int rowno,int cellno) throws Throwable {
	    	FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 3(1).xlsx");
	    	Workbook wb = WorkbookFactory.create(fis);
	    	String value = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
	    	wb.close();
	    	return value;
}
	 public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {
		
		        Object[][] data = null;
		       
		 
		            FileInputStream fis = new FileInputStream(filePath);
		            XSSFWorkbook workbook = new XSSFWorkbook(fis);
		            XSSFSheet sheet = workbook.getSheet(sheetName);
		            XSSFRow row = sheet.getRow(0);
		            int noOfRows = sheet.getPhysicalNumberOfRows();
		            int noOfCols = row.getLastCellNum();
		            Cell cell;
		            data = new String[noOfRows - 1][noOfCols];
		 
		            for (int i = 1; i < noOfRows; i++) {
		                for (int j = 0; j < noOfCols; j++) {
		                    row = sheet.getRow(i);
		                    cell = row.getCell(j);
		                    data[i - 1][j] = cell.getStringCellValue();
		                }
		            }
		        
		        return data;
	    }
		 
}