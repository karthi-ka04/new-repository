package practise;

public class PrimeNumberRange {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			int count=0;
			int n=i;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
				   count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}
	}

}
