package polymorphismsample;

public class Child extends Parent{
	
	@Override //annotation
	public void display()
	{
		//super.display();
		System.out.println("method in child class");//In the child class will override the parent class we can only visible the method of child class
	}
	
	public static void main(String[] args) {
		Child ob = new Child();
		Parent ob1 = new Parent();//parent class ob creation
		ob.display();
		ob1.display();//latest function only we can get here we cannt get parent class

	}

}
