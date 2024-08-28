package tekpyramid;

import java.util.Scanner;

public class EvenNumberInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a []=new int[size];
		System.out.println("enter the array numbers");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
