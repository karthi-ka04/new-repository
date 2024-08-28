package practise;

import java.util.Scanner;

public class CountDigitOne {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  System.out.println("enter the number");
		  double num=s.nextDouble();
		  int count=0;
		  for(int i=1;i<=num;i++)
		  {
			  int n=i;
				while(n>0)
				{
					int d=n%10;
			    if(d==1)
			    {
				  count++;
			    }
			    n=n/10;
				}
			  
		  }
		  System.out.println(count);
		  
	}

}
