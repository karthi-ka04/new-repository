package stringprograms;

import java.util.Scanner;

public class SeparateCharacterAndNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next().toLowerCase();
		String temp="";
		String temp1="";
		String temp2="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' )
			{
				temp=temp+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				temp1=temp1+ch;
			}
			else
			{
				temp2=temp2+ch;
			}
		}
		System.out.println(temp+temp1+temp2);
	}

}
