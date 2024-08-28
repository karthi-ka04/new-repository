package stringsProgram;

public class Stringa2b3Isaabbb {

	public static void main(String[] args) {
	   String s="n3i2v3";
	   for(int i=0;i<s.length()-1;i=i+2) {
		   char ch=s.charAt(i);
		   int count=s.charAt(i+1)-48;
		   for(int j=0;j<count;j++) {
			   System.out.print(ch);
		   }
	   }

	}

	

}
