package package1;
class super_class{
	
	super_class(int a,int b){
		System.out.println("1");
	}
	
}
class child_class() extends super_class(String name)
{
 
	System.out.println("2");
}

class child_class2() 
{
  
	System.out.println("2");
}
}

public class Overloadingconstructor extends child_class(float b);
	
	public static void main(String[] args) {
		new Overloadingconstructor();
	}	
}	

	


