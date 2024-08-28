package practise;

import java.util.Scanner;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				int num=ch;
				char ch1=(char)(num+32);
				System.out.print(ch1);
			}
			else
			{
				System.out.print(ch);
			}
		}

	}

}
