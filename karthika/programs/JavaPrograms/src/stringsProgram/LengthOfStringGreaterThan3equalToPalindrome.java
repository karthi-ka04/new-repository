 package stringsProgram;

public class LengthOfStringGreaterThan3equalToPalindrome {

	public static void main(String[] args) {
		String s = "aabaac";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (s.substring(i, j).length() >= 3) {
					String s1 = s.substring(i, j);
					palindrome(s1);
				}

			}
		}

	}

	public static void palindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		if (rev.equals(s) ) {
			System.out.print(rev + " ");
		}
	
	}

}
