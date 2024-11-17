package collectionsample;

import java.util.ArrayList;

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
		
		ArrayList<String> b = new ArrayList<String>();
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
	}

}
