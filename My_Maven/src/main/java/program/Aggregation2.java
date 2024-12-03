package program;

public class Aggregation2 {


	public void display(float d,String e)
	{
		System.out.println(d);
		System.out.println(e);
	}
	public static void main(String[] args) {
		Aggregation1 ob = new Aggregation1();//aggregation done by here
		ob.print(10, 20);
		Aggregation2 ob1 = new Aggregation2();
		ob1.display(10.02f,"new program");
	}

}
