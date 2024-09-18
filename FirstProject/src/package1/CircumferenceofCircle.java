package package1;
import java.util.Scanner;
public class CircumferenceofCircle {
	static double pi=3.14;

	public static void main(String[] args) {
		Scanner C1=new Scanner(System.in);
		System.out.println("Enter the circumference of the circle");			
		double r=C1.nextDouble();
	       double circumference  = 2*pi*r;
		
		System.out.println("Circumference of circle "+circumference);
		
		C1.close();


	}

}
