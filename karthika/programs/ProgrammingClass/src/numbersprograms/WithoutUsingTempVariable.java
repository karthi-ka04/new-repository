package numbersprograms;

import java.util.Scanner;

public class WithoutUsingTempVariable {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a variable");
		int a=s.nextInt();
		System.out.println("enter the b variable");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
