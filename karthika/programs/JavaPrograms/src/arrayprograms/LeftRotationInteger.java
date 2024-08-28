package arrayprograms;

import java.util.Arrays;

public class LeftRotationInteger {

	public static void main(String[] args) {
		int a[]= {90,80,70,10};
		for(int i=1;i<=3;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
