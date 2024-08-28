package tekpyramid;

import java.util.Scanner;

public class PrimeNumberCountInTheRange {

	public static void main(String[] args) {
		int count1=0;
		for(int i=1;i<=10;i++) {
			int num=i;
			int count=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {	
					count++;
				}
			}
			if(count==2) {
				count1++;
			}
		}
		System.out.println(count1);
	}

}
