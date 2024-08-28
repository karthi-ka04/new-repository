package tekpyramid;

import java.util.Scanner;

public class StringSumProgram {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the string");
	   String s=sc.next();
	   String str="";
	   for(int i=0;i<s.length();i++) {
		   for(int j=i;j<s.length();j++) {
			   char ch=s.charAt(j);
			   str=str+ch;
			   System.out.println(str);
		   }
		   str="";
	   }

	}

}
