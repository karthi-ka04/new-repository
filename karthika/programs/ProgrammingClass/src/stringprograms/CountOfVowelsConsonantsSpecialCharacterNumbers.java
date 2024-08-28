package stringprograms;

import java.util.Scanner;

public class CountOfVowelsConsonantsSpecialCharacterNumbers {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next().toLowerCase();
	int vowels=0,consonants=0,specialchar=0,number=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z' )
		{
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		else if(ch>='0' && ch<='9')
		{
			number++;
		}
		else
		{
			specialchar++;
		}
	}
	System.out.println(vowels);
	System.out.println(consonants);
	System.out.println(number);
	System.out.println(specialchar);
	}

}
