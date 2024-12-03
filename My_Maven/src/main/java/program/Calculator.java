package program;

public class Calculator 
{
	public void calc(int a,int b)
	{
		System.out.println(a+b);
	}
	public void calc (int c,int d,int e)
	{
		System.out.println(c+d+e);
	}
	public void calc(int f,int g,int h,int i)
	{
		System.out.println(f+g+h+i);
	}
	
	public static void main(String[] args) 
	{
		Calculator ob = new Calculator();
		ob.calc(20, 30);
		ob.calc(10, 20, 25,30);
	}

}
