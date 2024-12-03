package program;

public class FullTimeEmployee extends Employee 
{
	//public void calculateSalary()
	@Override
	public void calculateSalary(int payperhr,int wrkhrs)
	//@Override
	//public void calculateSalary(int wrkhrs)
	{   
		//int salary = payment*wrkhrs;
		wrkhrs = 8;
		int salary = payperhr*8;
		//int salary = payment*8;
		System.out.println("The Full time salary is = "+salary);
	}
	public static void main(String[] args) 
	{
		FullTimeEmployee ob = new FullTimeEmployee();
		ob.calculateSalary(800,0);
		//ob.calculateSalary();
		//Employee ob1 = new FullTimeEmployee();
		//ob1.calculateSalary(8);
	}

}
