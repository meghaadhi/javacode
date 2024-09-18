package package1;

import java.util.Scanner;

public class CircumferenceofRectangle {

	public static void main(String[] args) {
		Scanner C2=new Scanner(System.in);
		System.out.println("Enter the value of l");			
		double l=C2.nextDouble();
		System.out.println("Enter the value of b");			
		double b=C2.nextDouble();
		double circumference=2*(l*b);
		System.out.println("Circumference of Rectangle" +circumference);
	    C2.close();

	}

}
