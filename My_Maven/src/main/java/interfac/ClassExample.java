package interfac;

public class ClassExample implements InterfaceExample{
	 public void example()
	 {
		 System.out.println("Interface Method");
	 }
	 public static void main(String[] args) 
	 {
		 System.out.println(InterfaceExample.a);
		 //ClassExample ob = new ClassExample();
		 InterfaceExample ob = new ClassExample();
		 ob.example();
		 ob.exam();
	 }
	@Override
	public void exam() 
	{
		 System.out.println("New Interface Method");
		
	}

}
