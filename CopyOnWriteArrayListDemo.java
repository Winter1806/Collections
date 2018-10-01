package collections;
import java.util.Iterator;
import java.util.concurrent.*;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<String> copy=new CopyOnWriteArrayList<>();
		copy.add("Baseball");
		copy.add("Football");
		copy.add("Cricket");
		
		Iterator<String>itr=copy.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	

}
