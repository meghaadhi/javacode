package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List m1=new ArrayList();
		m1.add(100);
		m1.add(99);
		m1.add(98);
		m1.add(97);
		System.out.println("before sorting"+m1);
		Collections.sort(m1);
		System.out.println("after sorting"+m1);
		
		List m2=new ArrayList();
		m2.add("akki");
		m2.add("pappu");
		m2.addAll(m1);
		System.out.println(m2);
		 boolean b1= m1.equals(m2);
		 System.out.println(b1);
		 m1.remove(1);//index one 99 is removed
		 System.out.println(m2.get(2));//after removing index 1
		 m2.remove("akki");//removing object
		 System.out.println(m2);
		     m2.clear();//clear my collection
		     System.out.println(m2);
		    boolean b2= m2.isEmpty();
		    System.out.println(b2);
		boolean b3 =   m1.contains("woman");
		System.out.println(b3);
		
		           
		 
		
		
		
	}

}
