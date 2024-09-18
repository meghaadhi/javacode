package Strng;
public class Count_Alphanumspecialspaces {
public static void main(String[] args) {
		int count_of_alphabet=0;
		int count_of_numeric=0;
		int count_of_spaces = 0;
		String a="megha 123@**";
		char[]c1=a.toCharArray();
		System.out.println(c1);
		for(int i=0;i<a.length();i++)
		{
	boolean b1=		  Character.isLetter(c1[i]);
	if(b1==true) {
		count_of_alphabet++;
	}
		}
		System.out.println("no of alphabets->"+count_of_alphabet);
		



for(int i=0;i<a.length();i++)
{
boolean b2= Character.isDigit(c1[i]);
if(b2==true) {
count_of_numeric++;
}
}
System.out.println("no of numeric->"+count_of_numeric);



for(int i=0;i<a.length();i++)
{
boolean b3= Character.isSpaceChar(c1[i]);
if(b3==true) {
	
	
	count_of_spaces++;
}
}
System.out.println("no of numeric->"+count_of_spaces);
}
}