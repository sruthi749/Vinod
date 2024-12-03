package program;

public class SwapWithoutTemp {

	public static void main (String args[])
	{
		int a =10;
		int b =20;
		System.out.println("Before swap");
		System.out.println("num1 ="+a);
		System.out.println("num2 ="+b);
		a=a+b;//(30=10+20)
		b=a-b;//(10=30-20)
		a=a-b;//(20=30-10)
		System.out.println("After swap");
		System.out.println("num1 ="+a);
		System.out.println("num2 ="+b);
	}
}
