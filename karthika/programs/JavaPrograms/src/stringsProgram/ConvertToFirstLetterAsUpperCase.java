package stringsProgram;

import java.util.Scanner;

public class ConvertToFirstLetterAsUpperCase {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
	    String s1[]=s.split(" ");
	    
	    for(int i=0;i<s1.length;i++) {
	    	String str=s1[i];
	    	str=Character.toUpperCase(str.charAt(0))+str.substring(1)+" ";
	    	System.out.print(str);
	    	
	    }

	}

}
