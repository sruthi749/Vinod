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
		ChildExmaple ob = new ChildExmaple();
		ob.abstractname();
		ob.display();

	}

}
