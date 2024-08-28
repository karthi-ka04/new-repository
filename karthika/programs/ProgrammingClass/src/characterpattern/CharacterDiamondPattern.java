package characterpattern;

import java.util.Scanner;

public class CharacterDiamondPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=(n*2)-1;i++)
		{
			char ch='A';
			for(int j=1;j<=(n*2)-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=(n*3)-1)
				{
					System.out.print(ch++ +" ");
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
