package numberprogram;

import java.util.Scanner;

public class CountTheParticularNumberInTheGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=60;i<=67;i++) {
			int n=i;
			while(n!=0) {
				int d=n%10;
				if(d==num) {
					count++;
				}
				n=n/10;
			}
		}
		System.out.println(count);

	}

}
