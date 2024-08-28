package numberpattern;

import java.util.Scanner;

public class NumberLeftTraingleNumIncreasing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print(num++ +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			}
	}

}
