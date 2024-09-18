package package1;

public class OverloadingMainMethod {
	
	public  void main()
	{
		System.out.println("without para");
	}
	
	public  void main(int a)
	{
	System.out.println("para1");
	
	}
	
	public void main(String b)
	{
		System.out.println("para2");
		
	}

	public static void main(String[] args) {
		OverloadingMainMethod s1=new OverloadingMainMethod();
		s1.main();
		s1.main(3);
		s1.main("print");
	
	}

}
