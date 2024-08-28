package numbersprograms;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n number");
		int n=s.nextInt();
		System.out.println("enter the n1 number");
		int n1=s.nextInt();
		int gcd=0;
		for(int i=1;i<=n&&i<=n1;i++)
		{
			if(n%i==0&&n1%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
