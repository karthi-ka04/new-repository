package arrayprograms;

import java.util.Scanner;

public class MergeTwoArrayInAnotherArrayInZigZagManner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of first array");
		int size=s.nextInt();
		System.out.println("enter the size of second array");
		int size1=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size1];
		
		System.out.println(" enter the array elements for 1st array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println(" enter the array elements for 2nd array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		
		System.out.println("merge two array elements into another array in zigzag manner");
		int c[]=new int[a.length+b.length];
		int temp=0;
		int temp1=0;
		for(int i=0;i<c.length;)
		{
			if(temp<a.length)
			{
				c[i]=a[temp++];
				i++;
			}
			if(temp1<b.length)
			{
				c[i]=b[temp1++];
				i++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
