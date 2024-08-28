package numbersprograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+"is palindrome number");
		}
		else
		{
			System.out.println(temp+"is not a palindrome number");
		}
	}

}
