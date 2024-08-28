package characterpattern;

import java.util.Scanner;

public class PyramidCharacterIncreasingAndDecreasing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=(n*2)-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1)
				{
					if(j<n)
					{
					System.out.print(ch++  +" ");
					}
					else
					{
						System.out.print(ch-- +" ");
					}
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
