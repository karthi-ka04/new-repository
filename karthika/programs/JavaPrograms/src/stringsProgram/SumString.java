
package stringsProgram;

import java.util.Scanner;

public class SumString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	    String s=sc.next();
	    String rev="";
	  /* for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	for(int j=i;j<s.length();j++) {
	    		char ch1=s.charAt(j);
	    		rev=rev+ch1;
	    		System.out.print(rev+" ");
	    	}
	    	rev="";
	    }*/
	    //different logic
	    for(int i=0;i<s.length();i++) {
	    	for(int j=i+1;j<=s.length();j++) {
	    		System.out.print(s.substring(i,j)+" ");
	    	}
	    }

	}

}
