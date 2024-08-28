package practise;

import java.util.Scanner;

public class ZereOneTriangle {
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
					if(i%2!=0) 
					{
						System.out.print(num+" ");
					}
					else 
					{
						
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
