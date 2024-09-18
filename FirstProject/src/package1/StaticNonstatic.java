package package1;

public class StaticNonstatic{
	
	    static void method_one() {
		 System.out.println("static method");
	    }
        void NonStatic() {
        	System.out.println("non static method");
   }

       public static void main(String[] args) {
		System.out.println("main");
		method_one();
		StaticNonstatic s1=new StaticNonstatic();
		s1.NonStatic();
	}
}
