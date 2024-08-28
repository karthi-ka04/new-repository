package stringsProgram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "LISTEN";
		String s2 = "SILENT";
		boolean flag = false;
		if (s1.length() != s2.length()) {
			System.out.println("not an anagram");
		} else {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length;) {
				if (ch1[i] == ch2[i]) {
					flag = true;
					i++;
	 			} else {
					flag = false;
					System.out.println("not an anagram");
					break;
				}
			}
			if (flag) {
				System.out.println("is a anagram");
			}
		}

	}

}
