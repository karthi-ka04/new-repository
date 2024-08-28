package stringsProgram;

public class ReverseTheStringSpacePlaceRemainSame {

	public static void main(String[] args) {
		String s="i love india";
	    String s1=s.replaceAll(" ", "");//remove spaces from s1
	    int n=s1.length()-1;//get last index of s1
	    
	    for(int i=0;i<s.length();i++) {//interate the ch from s to print the space
	    	if(s.charAt(i)==' ') {
	    		System.out.print(s.charAt(i));
	    	}
	    	else {
	    		System.out.print(s1.charAt(n));//iterate from s1 to print in reverse order
	    		n--;
	    	}
	    }
	    
	}

}
