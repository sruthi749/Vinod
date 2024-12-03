package program;

public class PayrollClassTwo extends PayrollClassOne 
{
	Double hra;
	Double pf;
	public void salbenefit()
	{
	 hra = basicpay * 0.05 ;
	 pf = basicpay * 0.20 ;
	 System.out.println("HRA :\t"+ hra);
	 System.out.println("PF :"+ pf);
	}
	
}
