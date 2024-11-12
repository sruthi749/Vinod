package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println("statement before exception");//code will execute before exception
		try
		{
		int c =a/b;
		} //try cant stand alone, with try block can work with try catch finally ,try catch & try finally
		/*catch(ArithmeticException e)
		{
			b=5;
			int c=a/b;
		System.out.println(c); //handling codes for try exception 
		//System.out.println(e);//printing occurred exception error
		}*/
		finally
		{
		System.out.println("Statement after handling exception"); //most important
		//output comes under ArithmeticException (unchecked)
		}
	}

}
