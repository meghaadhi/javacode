package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class While {
	public static void main(String[] args) {
			List li= new  ArrayList();
			 li.add(876);
			 li.add(745);
			 li.add(15);
			 li.add(90);
		System.out.println(li.size());
			 
			 		Iterator m1=li.iterator();
			 		while(m1.hasNext())
			 		{
			 			System.out.println(m1.next());
			 		}
			
			
		}

	}


