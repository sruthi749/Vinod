package debugging;

public class Sample 
{
	public void add()
	{
		int a =10;
		int b =20;
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Sample ob = new Sample();
		ob.add();
	}

}
