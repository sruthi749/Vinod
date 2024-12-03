package program;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>();
		//add
		ob.add("blue");
		ob.add("red");
		ob.add("green");
		System.out.println(ob);
		
		//retrieve
		System.out.println(ob.get(1));
		
		//remove
		ob.remove(2);
		System.out.println(ob);
		
		//contains/search
		System.out.println(ob.contains("red"));
		//Iterator
		Iterator s =ob.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		s.remove();
		System.out.println(ob);
	}

}
