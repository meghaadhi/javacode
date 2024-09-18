package Strng;
import java.util.Arrays;

public class Compare {
	public static void main(String[] args) 
	{
		char[] Alpha_1=new char[4];
		Alpha_1[0]='A';
		Alpha_1[1]='B';
		Alpha_1[2]='C';
		Alpha_1[3]='D';
		
		char Alpha_2[]=new char[4];
		Alpha_2[0]='A';
		Alpha_2[1]='B';
		Alpha_2[2]='C';
		Alpha_2[3]='D';
		 boolean b1 =Arrays.equals(Alpha_1, Alpha_2);
		 System.out.println(b1);
		
		 
		 

}
}