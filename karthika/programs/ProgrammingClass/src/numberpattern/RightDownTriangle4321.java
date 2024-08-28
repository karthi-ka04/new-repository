package numberpattern;

import java.util.Scanner;

public class RightDownTriangle4321 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=n;
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.print(num-- +" ");
				}
				else
				{
					System.out.print("  ");
					num--;
				}
				
			}
			System.out.println();
		}
	}

}
