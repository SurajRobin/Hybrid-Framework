package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
		// generic reusable methods
		// 1 . read the data from excel file
		// 2 . read the data from property files
		// 3 . write the data in excel file
		// 4 . get last row count
	
	// to read the excel data from excel sheet
		public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount ) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;
		}
		// to get last row count 
		public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
		}
		// write excel data in Excel Sheet 
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
			
		}
		
		// Read the data from property file or Properties file
		public String readPropertyData(String propPath,String keyValue) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(keyValue);
			return data;
			
		}
		

}
