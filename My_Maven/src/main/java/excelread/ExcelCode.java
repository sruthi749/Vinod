package excelread;//using pom.xml

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	 public static FileInputStream f ; //file path fetch
	 public static XSSFWorkbook w; //workbook fetch
	 public static XSSFSheet s;//sheet fetch
	 
	 public static String readStringData(int i,int j) throws IOException
	 {
		 f=new FileInputStream("C:\\Users\\hp\\Desktop\\Excelread.xlsx");//file path copy//shiftpress+right click path copy
		 w=new XSSFWorkbook(f);//workbook path
		 s=w.getSheet("Sheet1");//sheet pth
		 XSSFRow r=s.getRow(i);//row 
		 XSSFCell c = r.getCell(j);//column
		 return c.getStringCellValue();//value return to main method
	 }
	 
	 public static double readIntegerData(int i,int j) throws IOException
	 {
		 f=new FileInputStream("C:\\Users\\hp\\Desktop\\Excelread.xlsx");
		 w=new XSSFWorkbook(f);
		 s=w.getSheet("Sheet1");
		 XSSFRow r=s.getRow(i);
		 XSSFCell c = r.getCell(j);
		 return c.getNumericCellValue();
		 
	 }

}
