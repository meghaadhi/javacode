package package1;

public class Areaofcirclemath {
	
	final static double pi=Math.PI;
	
	public static void main(String[] args) {
		 
		for(int i=1;i<=10;i++) {
	    double r = Math.random();
		double area = pi*r*r;
		System.out.println("area of circle"+area);
	}

}
}
