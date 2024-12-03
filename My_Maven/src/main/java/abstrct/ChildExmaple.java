package abstrct;

public class ChildExmaple extends AbstractSample
{
	public void abstractname()
	{
		System.out.println("Abstract method");
	}
	public void show()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		AbstractSample ob = new ChildExmaple();//reference is parent class so only parent class properties take object (ob)
		ob.abstractname();
		ob.display();
		//ob.show();//childexample class (child class properties/data not taken)
		ChildExmaple ob1 =new ChildExmaple();
		ob1.abstractname();
		ob1.display();
		ob1.show();

	}

}
