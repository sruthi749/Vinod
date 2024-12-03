package hybridinheritance;

public class ChildClass extends ExampleSampleOne implements InterfaceOne,InterfaceTwo{
	public void print()
	{
		System.out.println("Method in child");
	}
	public void show()
	{
		System.out.println("definition of two abstract in two interface");
	}
	public static void main(String[] args) {
		ChildClass ob =new ChildClass();
		ob.print();
		ob.show();
		ob.display();
	}

}
