package numbersprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();//it will print 8 fibonacci number starting from 0
		int a=0,b=1;
		for(int i=1;i<num;i++)
		{
		System.out.println(a);
		int c=a+b;
		a=b;
		b=c;
		}
		//System.out.println(a);
	}

}
