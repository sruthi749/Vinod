package collectionsample;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob = new ArrayList();
		//add -- method used add words
		ob.add("hello");
		ob.add(12);
		ob.add(1.05f);
		ob.add('a');
		System.out.println(ob);
		
		/*ArrayList<String> b = new ArrayList<String>();
		b.add("New");
		b.add("program");
		//b.add(50);
		System.out.println(b);
		
		ArrayList <String> c =  new ArrayList();
		c.add("Hello");
		c.add("world");
		
		//addAll
		c.addAll(b);
		System.out.println(c);
		
		//remove
		c.remove(2);
		System.out.println(c);
		
		//removeAll
		c.removeAll(c);
		System.out.println(c);
		
		//size 
		System.out.println(b.size());
		
		//contains
		System.out.println(b.contains("New"));//exact word case sensitive 
		
		//isEmpty
		System.out.println(c.isEmpty());//empty value
		*/
		//Iterator - its a interface we can print elements one by one
		Iterator it = ob.iterator();//iterator() its a method
		while(it.hasNext())//hasNext - its a boolean true/false - there is element/not
		{
			System.out.println(it.next());//Returns the next element in the iteration
		}
		it.remove();//remove last index/element
		System.out.println(ob);
	}

}
