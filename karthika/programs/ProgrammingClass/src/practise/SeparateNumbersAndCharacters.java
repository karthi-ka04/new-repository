package practise;

import java.util.Scanner;

public class SeparateNumbersAndCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
		String alpha="";
		String num="";
		String specialchar="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				alpha=alpha+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				num=num+ch;
			}
			else
			{
				specialchar=specialchar+ch;
			}
		}
		System.out.println(alpha+num+specialchar);

	}

}
