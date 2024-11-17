package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
	String s = ExcelCode.readStringData(1,0);
	System.out.println(s);
	double c = ExcelCode.readIntegerData(1, 1);
	System.out.println(c);

	}

}
