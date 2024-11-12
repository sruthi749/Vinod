package exceptionhandling;

public class ExceptionSample {
	public void test(int age) throws LicenceException
	{
		if(age<18)
		{
			throw new LicenceException("Not Eligible");//There no class for LicenceException -- custom exception
			//unhandled exception type use throws
		}
		else 
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenceException 
	{
		ExceptionSample ob =new ExceptionSample();
		ob.test(15);
		/*try
		{
			ob.test(15);
		}
		catch(LicenceException e)
		{
			e.printStackTrace();
		}*/
	}

}
