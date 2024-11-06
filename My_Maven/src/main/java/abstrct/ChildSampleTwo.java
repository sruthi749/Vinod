package abstrct;

public class ChildSampleTwo extends AbstarctSampleTwo{

	public  void abname()
	{
		System.out.println("Abstract method");
	}
	public static void main(String[] args) {
		ChildSampleTwo ob = new ChildSampleTwo();
		ob.abname();

	}

}
