package stringprograms;

import java.util.Scanner;

public class CountTheStringOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
		System.out.println("enter the target string");
		String target=sc.next();
		int count=0;
		String s1[]=s.split(" ");
		//boolean flag=false;
		for(int i=0;i<s1.length;i++)
		{
			if(target.equals(s1[i]))
			{
				count++;
			}
		}
		
		if(count==0)
       {
    	   System.out.println("the target is not present");
       }
		else
		{
			System.out.println(" the count of target string is"+count);
			
		}
		
	}

}
