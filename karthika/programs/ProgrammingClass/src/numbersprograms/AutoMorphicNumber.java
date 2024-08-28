package numbersprograms;

import java.util.Scanner;

public class AutoMorphicNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int square=n*n;
		System.out.println("square of n is "+ square);
		int temp=n;
		while(n>0)
		{
			if(n%10==square%10)
			{
				n=n/10;
				square=square/10;
				
			}
			else
			{
				break;
			}
		}
		if(n==0)
		{
			System.out.println(temp+"is a automorphic number");
		}
		else
		{
			System.out.println(temp+"is not automorphic number");
		}
		
	}

}
