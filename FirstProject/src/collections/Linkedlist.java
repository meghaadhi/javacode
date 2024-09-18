package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(55);
		a1.add(43);
		a1.add(22);
		a1.add(34);
		//a1.add(22);
		//a1.add(34);
		//a1.add("ME");
		//a1.add(null);
		System.out.println("before sorting"+a1);
		Collections.sort(a1);
		System.out.println("after sorting"+a1);
		//System.out.println(a1);
		Iterator m1=a1.iterator();
		while(m1.hasNext())
			{
			System.out.println(m1.next());	
			}
			while(m1.hasprevious())
			 {
				 System.out.println(m1.previous());
			 }
			
		
	}
}


