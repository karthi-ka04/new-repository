package patternprograms;

import java.util.Scanner;

public class LetterA {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==1 && j>=2 && j<=4) || (j==1 && i>=2) || (j==5 && i>=2) || i==4 )                                                                        
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
