package tekpyramid;

import java.util.Scanner;

public class ConvertTheStringIntoAlternateCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.next();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i % 2 == 0) {
				if (ch >= 'a' && ch <= 'z') {
					int num = ch;
					char ch1 = (char) (num - 32);
					str = str + ch1;
				} else {
					str = str + ch;
				}
			} else {
				str = str +ch;
			}

		}
		System.out.println(str);

	}

}
