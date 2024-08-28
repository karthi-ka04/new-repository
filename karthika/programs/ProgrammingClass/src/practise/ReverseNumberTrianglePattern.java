package practise;

import java.util.Scanner;

public class ReverseNumberTrianglePattern {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=s.nextInt();
	    int num=1;
	    for(int i=1;i<=n;i++)
	    {
	    	num=i;
	    	int sum=0;
	    	for(int j=1;j<=(n*2)-1;j++)
	    	{
	    		if(i<=j && i+j<=n*2 && j-i==sum)
	    		{
	    		System.out.print(num++ +" ");
	    		sum=sum+2;
	    		}
	    		else
	    		{
	    			System.out.print("  ");
	    		}
	        }
	    	System.out.println();
	    	
	    }
	}

}
