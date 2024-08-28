package numbersprograms;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			
			if(i*i==num)
			{
				flag=true;
				System.out.println(i);
			}
		}
		if(flag==false)
		{
			System.out.println("square is not found");
		}
	}

}
