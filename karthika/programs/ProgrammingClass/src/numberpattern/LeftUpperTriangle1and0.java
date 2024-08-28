package numberpattern;

import java.util.Scanner;

public class LeftUpperTriangle1and0 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					if(j%2==0)
					{
						System.out.print(0+" ");
					}
		
				  else
				  {
					System.out.print(1+" ");
				  }
				}
			}
			
			System.out.println();
		}
	}

}
