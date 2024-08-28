package stringsProgram;

import java.util.Scanner;

public class ReverseStringAndCheckPalindrome {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			res = ch + res;
		}
		System.out.println(res);
		if(s.equals(res)) {
			System.out.println(s +" is palindrome");
		}
		else {
			System.out.println(s +" is not palindrome");
		}
	}

}
