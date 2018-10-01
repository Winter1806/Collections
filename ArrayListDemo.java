package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		ArrayList<Integer>al=new ArrayList<>(n);
		for(int i=1;i<n;i++)
		{
			al.add(i);
		}
		System.out.println(al);

		al.remove(3);
		System.out.println("Remove Operation::"+al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(i+" ");
		}
	}

}
