package numbersprograms;



public class SumOfPrimeNumber {
	public static void main(String[] args) {
		
	
		int sum=0;
		for(int i=1;i<=10;i++)
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
			  sum=sum+n; 
		  }
		}
         System.out.println(sum);
	}
}

