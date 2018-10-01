package collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		Vector v=new Vector	();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		
		ListIterator lstItr= v.listIterator();
		System.out.println("Forward Direction");
		while(lstItr.hasNext())
		{
			System.out.println(lstItr.next());
		}
		
		System.out.println("Backward Direction");
		while(lstItr.hasPrevious())
		{
			System.out.println(lstItr.previous());
		}
	}

}
