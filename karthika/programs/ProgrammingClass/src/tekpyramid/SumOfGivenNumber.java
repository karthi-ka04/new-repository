package tekpyramid;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
      System.out.println(sum);
	}

}
