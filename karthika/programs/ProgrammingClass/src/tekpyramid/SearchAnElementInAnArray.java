package tekpyramid;

import java.util.Scanner;

public class SearchAnElementInAnArray {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=sc.nextInt();
	 int a []=new int[size];
	 boolean flag=false;
	 System.out.println("enter the array elements");
	 for(int i=0;i<a.length;i++) {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("enter the key element");
	 int key=sc.nextInt();
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==key) {
			   flag=true;
			 System.out.println(key+"key is present");
		 }
	 }
	 if(flag==false) {
		 System.out.println( key+"key is not present");
	 }
	 
	// 2nd program
	 
	 System.out.println("enter the size of the array");
	 int size1=sc.nextInt();
	 int b []=new int[size];
	 boolean flag1=false;
	 System.out.println("enter the array elements");
	 for(int i=0;i<b.length;i++) {
		 b[i]=sc.nextInt();
	 }
	 System.out.println("enter the key element");
	 int key1=sc.nextInt();
	 
	 for(int i=0;i<a.length;i++) {
		 if(b[i]==key1) {
			   flag1=true;
			 System.out.println(" key is present");
			 break;
		 }
	 }
	 if(flag1==false) {
		 System.out.println( "key is not present");
	 }
			 

	}

}
