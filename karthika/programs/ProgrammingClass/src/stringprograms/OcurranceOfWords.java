package stringprograms;

import java.util.Scanner;

public class OcurranceOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
		String str="";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
		    str=s1[i];
		    for(int j=i+1;j<s1.length;j++)
		    {
		    	if(str.equalsIgnoreCase(s1[j]))
			    {
			    	count++;
			    	s1[j]="";
			    }
		    }
		    
		    if(count>=1 && s1[i]!="")
		    {
		    	System.out.println(s1[i]+"="+count);
		    	
		    }
		    
		}
	

	}

}
