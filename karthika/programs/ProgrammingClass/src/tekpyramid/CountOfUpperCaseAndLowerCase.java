package tekpyramid;

import java.util.Scanner;

public class CountOfUpperCaseAndLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string  sentence");
		String s=sc.nextLine();
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				upper++;
			}
			else if(ch>='a' && ch<='z'){
				lower++;
			}
		}
		System.out.println("The count of uppercase is"+upper);
		System.out.println("The count of lowercase is"+lower);

	}

}
