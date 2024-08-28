package tekpyramid;

import java.util.Scanner;

public class UpperToLowerAndLowerToUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
        String s2="";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String str = s1[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch >= 'a' && ch <= 'z') {
					int num = ch;
					char ch1 = (char) (num - 32);
				     System.out.print(ch1);
				} else if (ch >= 'A' && ch <= 'Z') {
					int num = ch;
					char ch1 = (char) (num + 32);
					System.out.print(ch1);
				}
			}
		}
	
	}

}
