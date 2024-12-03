package program;

public class Circle extends SuperClass{
	@Override
	public void show()
	{
		super.show();
		System.out.println("Circle Class");
	}
	public static void main(String[] args) {
		Circle ob = new Circle();
		ob.show();

	}

}
