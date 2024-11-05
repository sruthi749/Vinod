package encapsulation;

public class Test {
	private String name; //right click source generate setter and getter
	private int age;
	public void setData(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public void getData()
	{
		System.out.println("Name is :"+name);
		System.out.println("Name is :"+age);
	}
	

}
