package practise;

import java.util.Scanner;

public class CountPrimeNumber {
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the number");
	  double num=s.nextDouble();
	  
	  int count1=0;
	  for(int i=1;i<=num;i++)
	  {
		  int n=i;
		  int count=0;
		  for(int j=1;j<=n;j++)
		  {
			  if(n%j==0)
			  {
				  count++;
			  }
		  }
		  if(count==2)
		  {
			  count1++;
		  }
	  }
	  System.out.println(count1);
	}

}
