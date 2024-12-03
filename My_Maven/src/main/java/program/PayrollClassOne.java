package program;

import java.util.Scanner;

public class PayrollClassOne 
{
	int basicpay;
	int deduction;
	int bonus;
	Scanner s = new Scanner(System.in);
	//public void saldetails(int basicpay,int deduction,int bonus)
	public void saldetails()
	{
		 /*this.basicpay = basicpay ;
		 this.deduction = deduction ;
		 this.bonus = bonus ;
		 System.out.println("enter Basic pay :"+basicpay);//this.basic
		 System.out.println("enter Deduction :"+deduction);
		 System.out.println("enter Deduction :"+bonus);*/
		System.out.println("enter Basic pay :");
		basicpay = s.nextInt();
		System.out.println("enter Deduction :");
		deduction = s.nextInt();
		System.out.println("enter Bonus :");
		bonus = s.nextInt();
		
	}

}