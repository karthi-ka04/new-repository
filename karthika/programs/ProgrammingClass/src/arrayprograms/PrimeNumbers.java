package arrayprograms;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("print the array elements");
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int count=0;
			for(int j=1;j<=num;j++)
			{
			  if(num%j==0)
			  {
				  count++;
			  }
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
			
		}
	}

}
