package arrayprograms;

import java.util.Scanner;

public class ToTakeElementFromUser {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
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
			System.out.println(a[i]);
		}
	}

}
