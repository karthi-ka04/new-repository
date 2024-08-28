package practise;

import java.util.Scanner;

public class CountVowelsNumbersSpecialCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next().toLowerCase();
		int vowels=0,conso=0,num=0,specialchar=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vowels++;
				}
				else
			    {
				conso++;
			    }
			}
			else if(ch>='0' && ch<='9')
			{
				num++;
			}
			else
			{
				specialchar++;
			}
		}
		System.out.println(vowels);
		System.out.println(conso);
		System.out.println(num);
		System.out.println(specialchar);

	}

}
