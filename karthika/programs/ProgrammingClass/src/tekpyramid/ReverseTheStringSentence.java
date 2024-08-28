package tekpyramid;

import java.util.Scanner;

public class ReverseTheStringSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the string sentence");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String rev="";
	/*	for(int i=s1.length-1;i>=0;i--) {
			String str=s1[i];
			for(int j=0;j<str.length();j++) {
				char ch=str.charAt(j);
				if(ch>='a' && ch<='z') {
					rev=rev+ch;
				}
			}
			rev=rev+" ";
		}
       System.out.println(rev);*/
		for(int i=s1.length-1;i>=0;i--) {
			rev=rev+s1[i]+" ";
		}
		System.out.println(rev);
		
		
		
	}
}
