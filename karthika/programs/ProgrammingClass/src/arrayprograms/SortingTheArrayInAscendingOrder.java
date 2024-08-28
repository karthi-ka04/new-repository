package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTheArrayInAscendingOrder {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
				//System.out.println(Arrays.toString(a));
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
