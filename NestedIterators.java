package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NestedIterators {
	
	public static void main(String[] args) {
		
		List<Integer> l=new LinkedList<>();
		l.add(2);
		l.add(3);
		l.add(4);
		
		List<Integer>l1=new LinkedList<>();
		l1.add(7);
		l1.add(8);
		l1.add(9);
		
		/*for(Iterator<Integer>itr1=l.iterator();itr1.hasNext();)
		{
			for(Iterator<Integer>itr2=l1.iterator();itr2.hasNext();)
			{
				if(itr1.next()<itr2.next())
				{
					System.out.println(itr1.next());
				}
			}
		}*/
		
		for(int a:l)
		{
			for(int b:l1)
			{
				if(a<b)
				{
					System.out.println(a+" ");
				}
			}	
				
		}
	}

}
