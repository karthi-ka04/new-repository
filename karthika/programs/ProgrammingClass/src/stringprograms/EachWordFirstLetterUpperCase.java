package stringprograms;

import java.util.Scanner;

public class EachWordFirstLetterUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
        String s=sc.nextLine();
       
        String s1[]=s.split(" ");
        String rev="";
        for(int i=0;i<s1.length;i++)
        {
        	String str=s1[i];
        	for(int j=0;j<str.length();j++)
        	{
        		char ch=str.charAt(j);
        		if(j==0 && ch>='a' && ch<='z')
        		{
        			int  num=ch;
        			char ch1=(char)(num-32);
        			rev=rev+ch1;
        	    }
        		else
        		{
      
        			rev=rev+ch;
        		}
        	}
        	rev=rev+" ";
        }
        System.out.println(rev);
	}

}
