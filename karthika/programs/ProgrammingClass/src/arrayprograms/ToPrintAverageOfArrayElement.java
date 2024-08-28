package arrayprograms;

import java.util.Scanner;

public class ToPrintAverageOfArrayElement {
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
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			//int avg=sum/a.length;
			int avg=sum/size;
			System.out.println(avg);
		}


}
