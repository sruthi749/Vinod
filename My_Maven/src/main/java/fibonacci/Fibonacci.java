package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		int num1 =0;
		int num2 =1;
		System.out.print(num1+" "+num2);
		int num3;
		for(int i=1;i<=10;i++)
		{
			num3 = num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}

	}

}
