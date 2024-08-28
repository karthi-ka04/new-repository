package practise;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sting");
		String s=sc.next();
		
		/*String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev))
		{
			System.out.println(s+" is a palindrome");
		}
		else
		{
			System.out.println(s+" is not a palindrome");
		}*/
		//without using methods
		
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
			System.out.println(s+" is a paindrome");
		}
		else
		{
			System.out.println(s+" is not a palindrome");
		}
		

	}

}
