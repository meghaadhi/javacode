package package1;
import java.util.Scanner;

public class GroTech {

	public static void main(String[] args) {
		Scanner M2=new Scanner(System.in);
		System.out.println("Enter Your FirstName");
		String FirstName=M2.next();
		System.out.println("Enter Your LastName");
		String LastName=M2.next();
		System.out.println("Enter Your Emailid");
		String Emailid=M2.next();
	    System.out.println("Enter Your password");
		String password=M2.next();
		System.out.println("Enter Your Current Address");
		String CAddress=M2.next();
		System.out.println("Enter Your Permanent Address");
		String PAddress=M2.next();
	    System.out.println("Enter Your Pincode");
		String Pincode=M2.next();
		System.out.println("Sucessfully Registered");
		System.out.println(""+Pincode+password+CAddress+PAddress+FirstName+LastName+Emailid+password);

		M2.close();

	}
}
