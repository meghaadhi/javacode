package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class Collection1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(55);
		a1.add(43);
		a1.add(22);
		a1.add(34);
		a1.add(67);
		a1.add(66);
		a1.add(67);
		a1.add(66);
		//a1.add("country");
		//a1.add("city");
		//a1.add(null);
		System.out.println("before sorting"+a1);
		Collections.sort(a1);
		System.out.println("after sorting"+a1);
		
		ListIterator i2=a1.listIterator();
		 
		 while(i2.hasNext())
		 {
			 System.out.println(i2.next());
		 }
		 while(i2.hasPrevious())
		 {
			 System.out.println(i2.previous());
		 }
		
		
		/*Iterator m1=a1.iterator();
		while(m1.hasNext()){
			{
			System.out.println(m1.next());	
			}
		
		
		System.out.println(a1);
		
		}*/
		
		
		

}
}
