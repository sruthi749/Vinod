package exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		try
		{
		String val = null;
		System.out.println(val.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			String val = "null";
			System.out.println(val.length());
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		//NullPointerException there is no value in String 
	}

}
