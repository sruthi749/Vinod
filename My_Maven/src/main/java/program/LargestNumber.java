package program;

public class LargestNumber {

	public static void main(String[] args) {
		int a = 10;//number1
		int b = 50;//number2
		int c = 80;//number3
		
		System.out.println("number1 is ="+a);
		System.out.println("number1 is ="+b);
		System.out.println("number1 is ="+c);
		
		int large = 0;
		if(a>b&&a>c)
		{
			large =a;
		}
		else if(b>c)
		{
			large = b;
		}
		else if(c>a)
		{
			large =c;
		}
		System.out.println("The largest number is ="+large);

	}

}
