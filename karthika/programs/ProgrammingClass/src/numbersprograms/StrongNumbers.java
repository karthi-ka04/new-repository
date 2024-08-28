package numbersprograms;

import java.util.Scanner;

public class StrongNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int d=num%10;
			int fact=1;
			for(int i=d;i>=1;i--)
			{
	           fact=fact*i;			
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+"is a strong number");
		}
		else
		{
			System.out.println(temp+"is not a strong number");
		}
	}

}
