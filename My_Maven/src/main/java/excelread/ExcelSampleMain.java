package excelread;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class ExcelSampleMain extends ExcelSample
{
	public static void readAllData()
	{
		for(int i = 0; i< s.getLastRowNum();i++)
		{
			XSSFRow r = s.getRow(i);
			if(r != null)
			{
				for(int j =0; j<r.getLastCellNum();j++)
				{
					XSSFCell c = r.getCell(j);
					if(c!=null)
					{
						 switch (c.getCellTypeEnum()) {
                         case STRING: // Handle string cells
                             System.out.print(c.getStringCellValue() + "\t");
                             break;
                         case NUMERIC: // Handle numeric cells
                             System.out.print(c.getNumericCellValue() + "\t");
                             break;
						default:
							break;
						}
						
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException 
	{
		initializeExcel("C:\\Users\\hp\\Desktop\\Excelread.xlsx", "Sheet1");
		readAllData();
	}

}
