package practise;

import java.util.Scanner;

public class PowerProgram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("enter the power");
	    int p=s.nextInt();
	    int power=1;
	    for(int i=1;i<=p;i++)
	    {
	    	power=power*n;
	    }
	    System.out.println(power);
	}

}
