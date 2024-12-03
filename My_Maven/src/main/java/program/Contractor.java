package program;

public class Contractor extends Employee 
{
	//int wrkhr=5;
	//public void calculateSalary()no parametere
	@Override
	public void calculateSalary(int payperhr,int wrkhrs)//parameter used
	//@Override
	//public void calculateSalary(int wrkhrs)
	{
		//int salary = payment*wrkhrs;
		//int salary = payment*wrkhr;
		int salary = payperhr*wrkhrs;
		System.out.println("The part time salary is = "+salary);
	}
	public static void main(String[] args) 
	{
		Contractor ob = new Contractor();
		ob.calculateSalary(200,5);
		//ob.calculateSalary();
		//Employee ob1 = new Contractor();
		//ob1.calculateSalary(2);
	}

}
