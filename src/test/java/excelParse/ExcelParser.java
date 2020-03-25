package excelParse;

import webpages.

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParser {

	public static void main(String[] args) { 
		
		File excel = new File("C://temp/Employee.xlsx"); 
		FileInputStream fis = new FileInputStream(excel); 
		XSSFWorkbook book = new XSSFWorkbook(fis); 
		XSSFSheet sheet = book.getSheetAt(0);
		
		Cell cell = 
		
	}

}
