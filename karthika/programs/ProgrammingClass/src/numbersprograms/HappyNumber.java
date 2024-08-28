
package numbersprograms;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int temp=num;
		while(true)
		{
			int sum=0;
			while(num>0)
			{
				int d=num%10;
				sum=sum+d*d;
				num=num/10;
			}
			if(sum==1)
			{
				System.out.println(temp+"is a happy number");
				break;
			}
			else if(sum==4)
			{
				System.out.println(temp+"is not a happy number");
				break;
			}
			num=sum;
		}
		
	}

}
