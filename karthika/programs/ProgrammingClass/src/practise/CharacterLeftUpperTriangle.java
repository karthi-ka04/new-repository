package practise;

import java.util.Scanner;

public class CharacterLeftUpperTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
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
