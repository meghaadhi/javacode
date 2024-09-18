package package1;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner S6=new Scanner(System.in);
		System.out.println("Enter the value of h");			
		double h=S6.nextDouble();
		double area=0.5*h*h;
		System.out.println("Area of triangle" +area);
	    S6.close();

	}

}
