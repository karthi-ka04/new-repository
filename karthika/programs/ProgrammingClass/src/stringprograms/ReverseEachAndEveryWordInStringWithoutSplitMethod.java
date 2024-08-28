package stringprograms;

import java.util.Scanner;

public class ReverseEachAndEveryWordInStringWithoutSplitMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
		String rev="";
		s=s+" ";
		String str="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				str=str+ch;
			}
			else
			{
				for(int j=str.length()-1;j>=0;j--)
				{
					char ch1=str.charAt(j);
					rev=rev+ch1;
				}

				rev=rev+" ";
				str="";
			}
				
		}
		System.out.println(rev);
	}
}
