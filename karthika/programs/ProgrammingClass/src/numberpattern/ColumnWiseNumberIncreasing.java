package numberpattern;

import java.util.Scanner;

public class ColumnWiseNumberIncreasing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=i;
			for(int j=1;j<=n;j++)
			{
			   System.out.print(num +" ");
			   num=num+n;
			}
			System.out.println();
		}
	}

}
