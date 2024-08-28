package arrayprograms;

import java.util.Scanner;

public class EvenNumber {
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
				if(a[i]%2==0)
				{
				System.out.println(a[i]);
				}
			}
		}
}


