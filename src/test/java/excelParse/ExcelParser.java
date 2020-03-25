package excelParse;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParser {

	public static void main(String[] args) { 
		
		try {
			File excel = new File("src/"); 
			FileInputStream fis = new FileInputStream(excel); 
			XSSFWorkbook book = new XSSFWorkbook(fis); 
			XSSFSheet sheet = book.getSheetAt(0);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
