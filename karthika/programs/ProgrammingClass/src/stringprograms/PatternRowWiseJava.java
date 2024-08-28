package stringprograms;

import java.util.Scanner;

public class PatternRowWiseJava {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		// System.out.println("enter the number");
		 //int n=sc.nextInt();
		 System.out.println("enter the string");
		 String s=sc.next();
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 for(int j=0;j<s.length();j++)
			 {
				 if(i>=j)
				 {
					 System.out.print(ch +" ");
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
