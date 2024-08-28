package numbersprograms;

import java.util.Scanner;

public class MultiplicationNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int mul= num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
	}

}
