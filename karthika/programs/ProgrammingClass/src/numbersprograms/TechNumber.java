package numbersprograms;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=0;
		int temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		if(count%2==0)
		{
			count=count/2;
			int div=1;
			for(int i=1;i<=count;i++)
			{
				div=div*10;
			}
			int last=n%div;
			int first=n/div;
			int sum=last+first;
			if(sum*sum==temp) {
				System.out.println(n+"is a tech number");
			}
			else
			{
				System.out.println(n+"is not tech number");
			}
	       
		}
		else
		{
			System.out.println(n+"is not a tech number");
		}
		
		
	}

}
