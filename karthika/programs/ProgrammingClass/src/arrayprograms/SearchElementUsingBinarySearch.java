package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementUsingBinarySearch {
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
        System.out.println("enter the number to search");
        int target=s.nextInt();
        Arrays.sort(a);
        int l=0;
        int h=a.length-1;
        int mid=0;
        boolean flag=false;
        
        while(l<=h)
        {
        	mid=(l+h)/2;
        	if(a[mid]==target)
        	{
        		flag=true;
        		System.out.println(target +"element is present");
        		break;
        		
        	}else if(a[mid]<target)
        	{
        		l=mid+1;
        	}
        	else if(a[mid]>target)
        	{
   
        		h=mid-1;
        	}
        	
        	
        }
        if(flag==false)
        {
        	System.out.println(target + " element is not present");
        }
	}

}
