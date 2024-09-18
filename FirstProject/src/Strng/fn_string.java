package Strng;

public class fn_string {

	public static void main(String[] args) {
		String name = "  Arjun 123";
		int size =name.length();
	   System.out.println(size);
	   System.out.println(name.toLowerCase());
       System.out.println(name.toUpperCase());
       System.out.println(name.trim());
       System.out.println(name.substring(3));
       System.out.println(name.substring(3,6));//6 is n-1
      
	}

}
