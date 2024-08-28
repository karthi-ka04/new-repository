package practise;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=0;j<s.length();j++)
			{
				char ch=s.charAt(j);
				if(i>=j)
				{
					System.out.print(ch+ " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
