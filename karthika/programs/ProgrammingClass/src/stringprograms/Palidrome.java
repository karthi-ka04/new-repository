package stringprograms;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		int temp=0;
		int temp1=s.length()-1;
		boolean flag=false;
		while(temp<temp1)
		{
		     if(s.charAt(temp)==s.charAt(temp1))
		     {
		    	 flag=true;
		    	 temp++;
		    	 temp1--;
		     }
		     else
		     {
		    	 flag=false;
		    	 break;
		     }
	    }
	    if(flag==true)
	    {
	    	System.out.println("palindrome");
	    }
	    else
	    {
	    	System.out.println("Not a palindrome");
	    }
	}

}
