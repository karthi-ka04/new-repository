package characterpattern;

import java.util.Scanner;

public class RowWiseSame {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}
