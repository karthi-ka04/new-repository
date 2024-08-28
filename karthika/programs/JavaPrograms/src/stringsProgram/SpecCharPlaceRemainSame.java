package stringsProgram;

public class SpecCharPlaceRemainSame {

	public static void main(String[] args) {
		String s="h&el$l%o9";
		String s1=s.replaceAll("[^A-Z,a-z,0-9]", "");
		System.out.println(s1);
		int n=s1.length()-1;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='0' && ch<='9') {
				System.out.print(s1.charAt(n--));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
