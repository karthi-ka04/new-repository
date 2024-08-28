package arrayprograms;

import java.util.Scanner;

public class ToPrintDuplicateElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a []=new int[size];
		System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
        	int count=0;
             for(int j=i+1;j<a.length;j++)
        		{
        			if(a[i]==a[j])
        			{
        				count++;
        				a[j]=Integer.MIN_VALUE;
        			
        			}
        		}
            // if(count==0 && a[i]!=-1)
             if(count>0 && a[i]!=Integer.MIN_VALUE)
             {
            	 System.out.println(a[i]);
             }
        }
        
		
	}

}
