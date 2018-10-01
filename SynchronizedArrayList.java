package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {
	
	public static void main(String[] args) {
		
		List<String> synArrayList=Collections.synchronizedList(new ArrayList<>());
		synArrayList.add("Cricket");
		synArrayList.add("Football");
		synArrayList.add("Baseball");
		
		System.out.println("Synchronized ArrayList Iteration");
		synchronized (synArrayList) {
			Iterator<String>itr=synArrayList.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
	}

}
