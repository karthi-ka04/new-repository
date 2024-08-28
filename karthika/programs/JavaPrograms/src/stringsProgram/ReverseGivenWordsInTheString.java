package stringsProgram;

import java.util.Scanner;

public class ReverseGivenWordsInTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String rev="";
	for(int i=s1.length-1;i>=0;i-- ) {
			rev=rev+s1[i]+" ";
		}
		System.out.println(rev);
		
	/*	for(int i=0;i<s1.length;i++) {
			rev=s1[i]+" "+rev;
		}
		System.out.println(rev);*/

	}

}
