package tekpyramid;

import java.util.Scanner;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int secmax=0;
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max) {
				secmax=a[i];
			}
		}
      System.out.println(secmax);
	}

}
