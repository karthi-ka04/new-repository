package patternprograms;

import java.util.Scanner;

public class RightHallowPyramid {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=(n*2)-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i+j==n*2||i==j)
				{
					System.out.print("* ");
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
