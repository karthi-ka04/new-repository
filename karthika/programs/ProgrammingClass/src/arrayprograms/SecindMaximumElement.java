package arrayprograms;

import java.util.Scanner;

public class SecindMaximumElement {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int size=s.nextInt();
		int a[]=new int[size];

		
		System.out.println(" enter the array elements for 1st array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		int secmax=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		System.out.println(secmax);
		
		

	}

}
