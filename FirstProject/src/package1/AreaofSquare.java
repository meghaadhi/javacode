package package1;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		Scanner S4=new Scanner(System.in);
		System.out.println("Enter the value of a");			
		double a=S4.nextDouble();
		double area=a*a;
		System.out.println("Area of Square" +area);
	    S4.close();

	}

}
