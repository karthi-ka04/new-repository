package arrayprograms;

import java.util.Scanner;

public class SearchAnElement {
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
	System.out.println("enter the key number");
	int key=s.nextInt();
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{ 
			flag=true;
			System.out.println(key+"element is present");
			
			break;
		}
	}
	if(flag==false)
	{
		System.out.println(key+"element is not present");
	}
		
	}

}
