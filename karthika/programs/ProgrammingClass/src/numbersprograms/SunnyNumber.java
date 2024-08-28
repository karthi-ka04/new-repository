package numbersprograms;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int n1=n+1;
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n1)
			{
				flag=true;
				System.out.println(n+"is a sunny number");
			}
		}
		if(flag==false) {
			System.out.println(n+"is not a sunny number");
		}
	}

}
