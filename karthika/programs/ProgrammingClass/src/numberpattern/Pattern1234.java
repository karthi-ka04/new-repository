package numberpattern;

import java.util.Scanner;

public class Pattern1234 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
