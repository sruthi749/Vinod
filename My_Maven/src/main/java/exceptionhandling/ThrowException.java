package exceptionhandling;

public class ThrowException {
	public static void testThrow(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");//throw exception
			//System.out.println("Not Eligible");
		}
		else 
		{
			System.out.println("Eligible");
		}
		
	}

	public static void main(String[] args) {
	ThrowException.testThrow(12);
	System.out.println("end of statement");

	}

}
