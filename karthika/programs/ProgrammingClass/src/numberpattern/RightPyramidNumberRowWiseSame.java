package numberpattern;

import java.util.Scanner;

public class RightPyramidNumberRowWiseSame {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=(n*2)-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j && i+j<=n*2)
				{
					System.out.print(i +" ");
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
