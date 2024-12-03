package program;



public class PayrollChildThree extends PayrollClassTwo {
	public void totalsalary()
	{
		Double totalsal = basicpay+hra-pf-deduction+bonus;
		System.out.println("Total Salary :" + totalsal);
	}

	public static void main(String[] args) {
		PayrollChildThree ob = new PayrollChildThree();
		ob.saldetails();
		ob.salbenefit();
		ob.totalsalary();

	}

}

