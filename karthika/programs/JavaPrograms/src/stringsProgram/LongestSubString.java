package stringsProgram;

public class LongestSubString {

	public static void main(String[] args) {
		String s="abcdefg";
		String max="";
		
		 for(int i=0;i<s.length();i++) {
			 for(int j=i+1;j<=s.length();j++) {
				 if(max.length()<s.substring(i,j).length()) {
					 max=s.substring(i, j);
				 }
			 }
		 }
		 System.out.println(max);

	}

}
