package characterpattern;

import java.util.Scanner;

public class CharacterAndNumberRowWise {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
	

}
