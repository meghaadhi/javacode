package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashNext{


		public static void main(String[] args) {
			List li= new  ArrayList();// write this 1 st then import as it is object class
			 li.add(876);
			 li.add(745);
			 li.add(15);
			 li.add(90);
			 
			 Iterator m1=  li.iterator();
			
			 while (m1.hasNext())
			 {
				 System.out.println(m1.next());
			 }
			 System.out.println("using List Iterator:");
			 
			 	ListIterator i2=			li.listIterator();
			 
			 while(i2.hasNext())
			 {
				 System.out.println(i2.next());
			 }
			 
			 while(i2.hasPrevious())
			 {
				 System.out.println(i2.previous());
			 }
		}
}



