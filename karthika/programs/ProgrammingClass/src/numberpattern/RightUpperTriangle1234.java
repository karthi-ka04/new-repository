package numberpattern;

import java.util.Scanner;

public class RightUpperTriangle1234 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=1;
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
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