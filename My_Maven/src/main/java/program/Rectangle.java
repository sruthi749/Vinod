package program;

public class Rectangle extends SuperClass{
	@Override
	public void show()
	{
		super.show();
		System.out.println("Rectangle Class");
	}

	public static void main(String[] args) {
		Rectangle ob = new Rectangle();
		ob.show();

	}

}
