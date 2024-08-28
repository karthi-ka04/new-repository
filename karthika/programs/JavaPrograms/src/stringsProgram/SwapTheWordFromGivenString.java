package stringsProgram;

import java.util.Scanner;

public class SwapTheWordFromGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}

	}

}
