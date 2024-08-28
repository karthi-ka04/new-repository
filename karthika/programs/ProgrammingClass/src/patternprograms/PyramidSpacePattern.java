package patternprograms;

import java.util.Scanner;

public class PyramidSpacePattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{     
			int sum=n+1;
			for(int j=1;j<=(n*2)-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1 && i+j==sum)
				{
					System.out.print("* ");
					sum=sum+2;
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
	
	

		
		
