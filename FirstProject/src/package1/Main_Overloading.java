package package1;

class zoom
{
	void login()
	{
		System.out.println("1");
	}
}

public class Main_Overloading extends zoom {
	
   void login() 
	{
		System.out.println("12");
		super.login();
	}
    
  
	public static void main(String[] args) {
		
		
		Main_Overloading s1=new Main_Overloading();
		s1.login();
		
		
				
	}

}

