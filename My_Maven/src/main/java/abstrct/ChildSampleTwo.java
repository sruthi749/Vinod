package abstrct;

public class ChildSampleTwo extends AbstarctSampleTwo{

	public void abstractname()
	{
		System.out.println("Abstract method");
	}
	public void show()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		AbstarctSampleTwo ob = new ChildSampleTwo();
		ob.abstractname();
		ob.display();

	}

}
