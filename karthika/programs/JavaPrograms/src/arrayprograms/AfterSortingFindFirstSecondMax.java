package arrayprograms;

import java.util.Arrays;

public class AfterSortingFindFirstSecondMax {

	public static void main(String[] args) {
		int a[]= {86,23,45,25,12};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	   System.out.println(Arrays.toString(a)); 
		int firstmax = a[0];
		int secmax=a[1];
		System.out.println(firstmax);
		System.out.println(secmax);

	}

}
