package package1;
import java.util.Scanner;
public class AreaofCircle {
	static double pi=3.14;

	public static void main(String[] args) {
		Scanner S2=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");			
		double r=S2.nextDouble();
	       double area  = pi*r*r;
		
		System.out.println("Area of circle "+area);
		
		S2.close();

	}

}
