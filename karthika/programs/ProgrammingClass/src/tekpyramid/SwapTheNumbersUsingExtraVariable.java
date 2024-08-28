package tekpyramid;

import java.util.Scanner;

public class SwapTheNumbersUsingExtraVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a variable");
		int a=sc.nextInt();
		System.out.println("enter the b variable");
		int b=sc.nextInt();
		int c=a+b;
	    b=c-b;
	    a=c-b;
	    System.out.println(a);
	    System.out.println(b);
	    
	    /*another method
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
	     

	}

}
