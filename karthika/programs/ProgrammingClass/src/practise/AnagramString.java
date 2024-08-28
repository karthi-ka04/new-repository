package practise;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string1");
	String s1=sc.next();
	System.out.println("enter the string2");
	String s2=sc.next();
	boolean flag=false;
	if(s1.length()!=s2.length())
	{
		System.out.println("not an anagram");
	}
	else
	{
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	
	for(int i=0;i<ch1.length;i++)
	{
		if(ch1[i]==ch2[i])
		{
			flag=true;
			
		}
		else
		{
			flag=false;
			break;
		}
	}
	}
	if(flag==true)
	{
		System.out.println("is a anagram");

	}
	else
	{
		System.out.println("not an anagram");
	}
	}

}
