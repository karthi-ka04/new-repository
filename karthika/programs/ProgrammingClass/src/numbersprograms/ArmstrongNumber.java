package numbersprograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=0;
		int temp=n;// 2 times we are copied
		int sum=0;
		int copy=n;
		while(copy>0)
		{
			copy=copy/10;
			count++;
		}
		System.out.println(count);
		while(n>0)
			{
			int d=n%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*d;
			}
			sum=sum+power;
			n=n/10;
			
			}
		if(temp==sum)
		{
			System.out.println(temp+"is a armstrong number");
		}
		else
		{
			System.out.println(temp+"is not a armstrong number");
		}
		
	}

}
