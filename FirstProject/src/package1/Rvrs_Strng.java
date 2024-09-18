package package1;

public class Rvrs_Strng {
	public static void main(String[] args) {
		String input="book";
		System.out.println("my input is book");
		String output="";
		for(int i =input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println("my reversed output->"+output);
	}

}
