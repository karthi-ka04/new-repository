package arrayprograms;

import java.util.Scanner;

public class CopyOneArrayElementIntoAnotherArrayElement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int size=s.nextInt();
	int a[]=new int[size];
	int b[]=new int[a.length];// can use size also---> int b[]=new int[size];
	
	System.out.println(" enter the array elements for 1st array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	
	System.out.println("print the array elements from the 1st to 2nd array");
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
		System.out.println(b[i]);
	}
	
}
}
