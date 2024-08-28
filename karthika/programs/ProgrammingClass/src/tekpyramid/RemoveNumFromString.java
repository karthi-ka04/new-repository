package tekpyramid;

import java.util.Scanner;

public class RemoveNumFromString {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter thr string");
	        String s=sc.nextLine();
	        String str="";
	        for(int i=0;i<s.length();i++) {
	        	char ch=s.charAt(i);
	        	if(ch >='a' && ch<='z')
	        	{
	        		str=str+ch;
	        	}
	        	else if(i==0) {
	        		str=str+ch;
	        	}
	        }
	        System.out.println(str);

	}

}
