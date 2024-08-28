package stringprograms;

import java.util.Scanner;

public class ReverseEachAndEveryWordInStringUsingSplitMethod {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
		String rev="";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String str=s1[i];
			for(int j=str.length()-1;j>=0;j--)
			{ 
				char ch=str.charAt(j);
				rev=rev+ch;
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	
		

	}

}
