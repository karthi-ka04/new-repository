package numberpattern;

import java.util.Scanner;

public class RowWiseNumDecreasing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
					System.out.print(i+" ");
		
			}
			System.out.println();
		}
	}

}
