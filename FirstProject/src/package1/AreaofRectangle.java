package package1;

import java.util.Scanner;
public class AreaofRectangle {

	public static void main(String[] args) {
		
	Scanner S3=new Scanner(System.in);
	System.out.println("Enter the value of l");			
	double l=S3.nextDouble();
	System.out.println("Enter the value of b");			
	double b=S3.nextDouble();
	double area=l*b;
	System.out.println("Area of Rectangle" +area);
    S3.close();

		}
}