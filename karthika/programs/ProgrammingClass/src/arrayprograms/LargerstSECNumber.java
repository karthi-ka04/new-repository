package arrayprograms;

import java.util.Scanner;

public class LargerstSECNumber {

	public static void main(String[] args) {
		int a[]= {1,5,6,7,8};
		int max=a[0];
		int secmax=0;
		 for(int i=1;i<a.length;i++) {
			 if(max<a[i]) {
				 secmax=max;
				 max=a[i];
			 }
			 else if(secmax<a[i] && a[i]!=max) {
				 secmax=a[i];
			 }
		 }
     System.out.println(secmax);
	}

}
