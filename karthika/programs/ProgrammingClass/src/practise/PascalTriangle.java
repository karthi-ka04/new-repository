package practise;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=s.nextInt();
	    int num=1;
	    for(int i=1;i<=n;i++)
	    {
	    	int sum=n+1;
	    	for(int j=1;j<=(n*2)-1;j++)
	    	{
	    		if(i+j>=n+1 && j-i<=n-1 && i+j==sum)
	    		{
	    			if(i==1 || i==2)
	    			{
	    		      System.out.print(num+" ");
	    		      sum=sum+2;
	    			}
	    			else if(i==3)
	    			{
	    				if(j<n)
	    				{
	    				System.out.print(num++ +" ");
	    				sum=sum+2;
	    				}
	    				else
	    				{
	    			    System.out.print(num-- +" ");
	    			    sum=sum+2;
	    			    num=1;
	    				}
	    			}
	    			else if(i==4)
	    			{
	    				if(j<n)
	    				{
	    	
	    				System.out.print(num +" ");
	    				sum=sum+2;
	    				num=num+2;
	    				}
	    				else
	    				{
	    			    System.out.print(num+" ");
	    			    sum=sum+2;
	    			    num=num-2;
	    				}

	    			}
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
