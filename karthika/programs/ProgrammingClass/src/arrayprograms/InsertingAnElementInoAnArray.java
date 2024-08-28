

package arrayprograms;

import java.util.Scanner;

public class InsertingAnElementInoAnArray {
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
		System.out.println("enter the index number");
		int index=s.nextInt();
		System.out.println("enter the element");
		int num=s.nextInt();
		int b[]=new int[a.length+1];
		int temp=0;
		for(int i=0;i<b.length;i++)
			
		{
				if(i==index)
				{
					b[i]=num;
				}
				else
				{
					b[i]=a[temp++];
				}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	 
		
	}

}
