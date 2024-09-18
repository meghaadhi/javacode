package Inheritance;

class manufacture {
	
	static void machine() {
		System.out.println("machine expenditure");
		
	}
}

class dealer extends manufacture{
static void bill() {
	System.out.println("bill of products");
		
	}

}

public class consumer extends dealer {
static void price() {
	System.out.println("item price");
		
	}
public static void main(String[] args) {
	machine();
	bill();
	price();
}
}
