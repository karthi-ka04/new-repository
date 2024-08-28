package arrayprograms;

import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;)
		{
			for(int j=0;j<b.length;j++)
			{
				b[j]=a[i];
				i--;
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
