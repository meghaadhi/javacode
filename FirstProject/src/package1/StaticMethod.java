package package1;
public class StaticMethod {
	
	static void method_first() {
		 System.out.println("method first");
	 }
	
	static void method_second() {
		 System.out.println("method second");
	 }
	
	static void method_third() {
		 System.out.println("method third");
	 }
	
	public static void main(String[] args) {
		System.out.println("main method");
		method_first();
		method_second();
		method_third();
}
}
