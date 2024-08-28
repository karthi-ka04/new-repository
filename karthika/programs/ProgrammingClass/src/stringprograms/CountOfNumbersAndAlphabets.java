
package stringprograms;

import java.util.Scanner;

public class CountOfNumbersAndAlphabets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next().toLowerCase();
		int alpha=0;
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' )
			{
				alpha++;
			}
			else if(ch>='0' && ch<='9')
			{
				num++;
			}
		}
		System.out.println(alpha);
		System.out.println(num);
	}

}
