package package1;

public class ConstructorEx {
    
	static void add(int a,int b) { //static method
	int add=a+b;
    System.out.println("addition1");
    System.out.println(add);
	}
	
	static void sub(int a,int b) {
		int sub=a-b;
	    System.out.println("substraction1");
	    System.out.println(sub);
		}

	static void mul(int a,int b) {
		int mul=a*b;
	    System.out.println("multiplication1");
	    System.out.println(mul);
		}
	
	 void add1(int a,int b) { //nonstatic method
		int add=a+b;
		System.out.println("add nonstatic");
		System.out.println(add);
	}
	
	void sub1(int a,int b) { 
		int sub=a-b;
		System.out.println("sub nonstatic");
		System.out.println(sub);
	}
	
	 void div1(int a,int b) { 
		int div=a/b;
		System.out.println("div nonstatic");
		System.out.println(div);
	}
	    ConstructorEx(int a,float b)
	{
		System.out.println(a*b);
	}
	    ConstructorEx(float a,float b)
	{
	    	System.out.println(a+b);
	}
	    ConstructorEx( int a, int b)
	{
		
		{
	if ((a>b)||(a<b))
	{
		System.out.println("a is greater");
	}
	else 
	{
		System.out.println("b is greater");
	}
		}
	}
		
  public static void main(String[] args)	
		{
	   add(10,20);
		sub(100,102);
		mul(224,32);//static
		System.out.println("***constructor****");
		ConstructorEx s1=new ConstructorEx(34,23.4f);
		ConstructorEx s2=new ConstructorEx(46.8f,23.3f);
		ConstructorEx s3=new ConstructorEx(16,78);
		System.out.println("***non static***");
		s1.add1(4,2);
		s1.sub1(6,8);
		s1.div1(10,2);
		}
	}
		
