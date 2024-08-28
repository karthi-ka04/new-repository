package stringsProgram;

import java.util.Scanner;

public class SeparateAlphabestNumbersSpecCharFromString {

	public static void main(String[] args) {
		Scanner sc=new 	Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String alpha="";
		String num="";
		String specchar="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alpha+=ch;
			}
			else if(ch>='0' && ch<='9') {
				num+=ch;
			}
			else {
				specchar+=ch;
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(specchar);

	}

}
