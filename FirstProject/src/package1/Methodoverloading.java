package package1;

public class Methodoverloading {
	
static void login(int a,int b) {
	    
		System.out.println("addition of two numbers");
		
	}
	
void login(int a,float b) {

	System.out.println("multiplication of two numbers");
		
	}
	public static void main(String[] args) {
		login(8,5);
		Methodoverloading s1=new Methodoverloading();
				s1.login(3,4.5f);
	}

}
