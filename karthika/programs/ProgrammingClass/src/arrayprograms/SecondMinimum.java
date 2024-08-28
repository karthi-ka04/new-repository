package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinimum {
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
		//To Find Out The Second Minimum First Need To Find Maximum number
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int min=max;
		int secmin=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin && a[i]!=min)
			{
				secmin=a[i];
			}
		}
		System.out.println("The Second Minimum Number is "+secmin);
		
		

	}

}
