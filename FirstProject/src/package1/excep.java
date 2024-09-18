package package1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class excep {
	
	public static void main(String[] args) 
	{
		try
		{
			Scanner s1=new Scanner(System.in);
		
System.out.println("enter age");
int a= s1.nextInt();
}
	catch(InputMismatchException a1)
	{
		
		System.out.println("sorry enter valid input");
		Scanner s1=new Scanner(System.in);
		int a= s1.nextInt();
	
	}
}
}

