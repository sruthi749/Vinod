package collectionsample;

import java.util.HashSet;
import java.util.Set;

public interface CollectionInterfaceSet 
{
	public static void main(String args[])
	{
		Set ob = new HashSet();
		//add 
		ob.add("new");
		ob.add(125);
		ob.add('S');
		System.out.println(ob);
		
		Set <Integer> obj = new HashSet<Integer>();
		obj.add(562);
		obj.add(623);
		System.out.println(obj);
		
		Set <Integer> a = new HashSet <Integer>();
		a.add(478);
		a.add(879);
		System.out.println(a);
		
		//addAll
		a.addAll(obj);
		System.out.println(a);
		
		//remove
		a.remove(2);
		System.out.println(a);
		
		//removeAll
		a.removeAll(a);
		System.out.println(a);
		
		//size
		System.out.println(obj.size());
		
		//contains
		System.out.println(obj.contains(562));//exact word case sensitive 
		
		//isEmpty
		System.out.println(obj.isEmpty());//empty value
	
	}
}
