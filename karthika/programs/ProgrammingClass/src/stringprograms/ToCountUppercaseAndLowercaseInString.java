package stringprograms;

import java.util.Scanner;

public class ToCountUppercaseAndLowercaseInString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	
	int upper=0;
	int lower=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z')
		{
			lower++;
		}
		else if(ch>='A' && ch<='Z')
		{
			upper++;
		}
	}
	System.out.println(upper);
	System.out.println(lower);
	
}
}
