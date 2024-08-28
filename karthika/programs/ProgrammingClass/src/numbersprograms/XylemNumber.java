package numbersprograms;

import java.util.Scanner;

public class XylemNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int temp=n;
		int innersum=0;
		int outersum=0;
			int lastdigit=n%10;
			n=n/10;
			while(n>=10)
			{
				int d=n%10;
				innersum=innersum+d;
				n=n/10;
			}
			outersum=lastdigit+n;
			if(innersum==outersum)
			{
				System.out.println(temp+"is a xylem number");
			}
			else
			{
				System.out.println(temp+"is not a xylem number");
		}
	}

}
