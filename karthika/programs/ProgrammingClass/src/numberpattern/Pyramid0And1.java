package numberpattern;

import java.util.Scanner;

public class Pyramid0And1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n*2)-1;j++)
			{
	 			
				if(i+j>=n+1 && j-i<=n-1)
				{ 
					if(j%2==0)
					{
						System.out.print(1+" ");
					}
					else
					{
						System.out.print(0+" ");
					}
					
				}
				else
				{
					System.out.print("  dd ");
				}
			}
			System.out.println();
		}
		
	}

}
