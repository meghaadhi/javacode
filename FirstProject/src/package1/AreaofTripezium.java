package package1;

import java.util.Scanner;

public class AreaofTripezium {

	public static void main(String[] args) {
		Scanner S7=new Scanner(System.in);
		System.out.println("Enter the value of l1");			
		double l1=S7.nextDouble();
		System.out.println("Enter the value of l2");			
		double l2=S7.nextDouble();
		System.out.println("Enter the value of h");			
		double h=S7.nextDouble();
		double area=0.5*(l1*l2)*h;
		System.out.println("Area of tripezium" +area);
	    S7.close();
		

	}

}
