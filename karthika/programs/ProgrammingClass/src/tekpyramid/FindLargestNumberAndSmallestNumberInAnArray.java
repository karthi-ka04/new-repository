package tekpyramid;

import java.util.Scanner;

public class FindLargestNumberAndSmallestNumberInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("The largest number in array is"+max);
		System.out.println("The smallest number in array is"+min);
		
	}

}
