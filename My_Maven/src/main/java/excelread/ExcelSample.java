package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample 
{
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	  public static void initializeExcel(String filePath, String sheetName) throws IOException {
	        f = new FileInputStream(filePath); // Initialize file input stream
	        w = new XSSFWorkbook(f);          // Initialize workbook
	        s = w.getSheet(sheetName);        // Load the specified sheet
	    }
	
	/*public static String readStringData(int i,int j) throws IOException
	{
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static Double readIntegerData(int i,int j) throws IOException
	{
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getNumericCellValue();
	}*/
}
