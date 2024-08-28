package stringsProgram;

import java.util.Scanner;

public class ReverseStringIndexStartsFromLast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		String res = "";
		for (int i = s.length()-1; i >=0; i--) {
			char ch = s.charAt(i);
			res = res+ch;
		}
		System.out.println(res);
	}

}
