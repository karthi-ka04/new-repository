package stringsProgram;

import java.util.Scanner;

public class CountAlphaNumSpecCharInGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int alpha=0;
		int num=0;
		int specchar=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alpha++;
			}
			else if(ch>='0' && ch<='9') {
				num++;
			}
			else {
				specchar++;
			}
		}
		System.out.println("the count of alpha is: "+ alpha);
		System.out.println("the count of num is:"+num);
		System.out.println("the count of specchar is:"+specchar);

	}

}
