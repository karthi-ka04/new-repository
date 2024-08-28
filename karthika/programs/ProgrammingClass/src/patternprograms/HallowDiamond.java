package patternprograms;

import java.util.Scanner;

public class HallowDiamond {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	for(int i=1;i<=(n*2)-1;i++)
	{
		for(int j=1;j<=(n*2)-1;j++)
		{
			if(i+j==n+1 || j-i==n-1 || i-j==n-1 ||i+j==(n*3)-1)
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
