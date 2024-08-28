package numbersprograms;

import java.util.Scanner;

public class MultiplicationRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting number");
		int start=s.nextInt();
		System.out.println("enter the ending number");
		int end=s.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int mul=i*j;
				System.out.println(i+"*"+j+"="+mul);
				
			}
			
			
		}
	}

}
