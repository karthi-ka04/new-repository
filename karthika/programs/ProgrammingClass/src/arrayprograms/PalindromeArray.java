package arrayprograms;

import java.util.Scanner;

public class PalindromeArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Array size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=0;j<b.length;j++)
			{
				b[j]=a[i];
				i--;
		    }
		}
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			//
			
			System.out.println(a[i]);
		temp=a[i];
		}
	
		int temp1=0;
	    for(int j=0;j<b.length;j++)
		{
		 //System.out.println(b[j]);
		 temp1=b[j];
		}
	    
	    if(temp==temp1)
	    {
	    	System.out.println("array elements are palindrome");
	    }
	    else
	    {
	    	System.out.println("array elements are not palindrome");
	    }
		/*for(int i=0;i<a.length;)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a==b)
				{
					System.out.println("it is a palindrome");
					i++;
				}
				else
				{
					System.out.println("is not a palindrome");
				}
			}
		}*/
		
		
		
	}

}
