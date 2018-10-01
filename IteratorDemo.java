package collections;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		HashSet<String>hs=new HashSet<>();
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
