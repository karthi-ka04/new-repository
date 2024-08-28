package arrayprograms;

import java.util.Scanner;

public class ToRemoveAnElementFromTheArray {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the size of an array");
		 int size=s.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array elements");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 int b[]=new int[a.length-1];
		 System.out.println("enter the index");
		 int index=s.nextInt();
		 int temp=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(i==index)
			 {
				 temp++;
				 
			 }
			 if(temp<a.length)
			 {
				 b[i]=a[temp++];
			 }
		 }
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i])
			 ;
		 }

	}

}
