package Strng;

import java.util.Arrays;

public class Compare_Strng {

	public static void main(String[] args) {
		String[] Alpha_1=new String[4];
		Alpha_1[0]="HI";
		Alpha_1[1]="hello";
		Alpha_1[2]="welcome";
		Alpha_1[3]="where";
		
		String Alpha_2[]=new String[4];
		Alpha_2[0]="how";
		Alpha_2[1]="when";
		Alpha_2[2]="what";
		Alpha_2[3]="come";
		 boolean b1 =Arrays.equals(Alpha_1, Alpha_2);
		 System.out.println(b1);
		

	}

}
