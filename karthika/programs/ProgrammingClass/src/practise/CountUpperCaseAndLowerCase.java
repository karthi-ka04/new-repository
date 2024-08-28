package practise;

import java.util.Scanner;

public class CountUpperCaseAndLowerCase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	
	int uppercase=0;
	int lowercase=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z')
		{
			uppercase++;
		}
		else if(ch>='A' && ch<='Z')
		{
			lowercase++;
		}
	}
	System.out.println(" uppercase is count is"+uppercase);
	System.out.println("the lowecase count is"+lowercase);

	}

}
