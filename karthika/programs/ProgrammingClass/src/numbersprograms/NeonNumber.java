package numbersprograms;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int sum=0;
		int square=num*num;
		while(square>0)
		{
			int d=square%10;
			sum=sum+d;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.println(num+"is a neon number");
		}
		else
		{
			System.out.println(num+"is not a neon number");
		}
	}

}
