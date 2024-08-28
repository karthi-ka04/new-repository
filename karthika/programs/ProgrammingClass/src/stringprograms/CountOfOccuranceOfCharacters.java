package stringprograms;

import java.util.Scanner;

public class CountOfOccuranceOfCharacters {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		int count=1;
		if(s1.indexOf(ch)==-1 && ch!=' ')
		{
			for(int j=i+1;j<s.length();j++)
			{
				char ch1=s.charAt(j);
				if(ch==ch1)
				{
					count++;
				}
			}
			System.out.println(ch+"-"+count);
			s1=s1+ch;
		}
	}

	}

}
