package scannerclass;

import java.util.Scanner; //import scanner

public class ScannerClass {

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = ob.nextInt();
		System.out.println("Enter the second number:");
		int b = ob.nextInt();
		int c = a+b;
		System.out.println("Sum is:\t"+ c);

	}

}
