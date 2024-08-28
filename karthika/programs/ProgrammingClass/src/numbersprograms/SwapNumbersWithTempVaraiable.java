package numbersprograms;

import java.util.Scanner;

public class SwapNumbersWithTempVaraiable {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a variable");
		int a=s.nextInt();
		System.out.println("enter the b variable");
		int b=s.nextInt();
		int temp=a;
		//before swapping
		System.out.println(a);
		System.out.println(b);
		//after swapping
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
