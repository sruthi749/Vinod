package multiinhert;

public class MultipleInheritanceChild implements MultipleInheritanceParent1,MultipleInheritanceParent2{

	public static void main(String[] args) {
		//MultipleInheritanceChild ob = new MultipleInheritanceChild();
		MultipleInheritanceParent1 ob = new MultipleInheritanceChild();//reference of parent class 1
		ob.print();
		//ob.show();
	}

	/*@Override
	public void show() {
		System.out.println("parent2 method");
		
	}
*/
	@Override
	public void print() {
		System.out.println("parent1 method");
		
	}

}
