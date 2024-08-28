package practise;

public class StrongNumber {
	public static void main(String[] args) {
		int num=123;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			int fact=1;
			for(int i=d;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+"is a strong number");
		}
		else
		{
			System.out.println(temp+"is not a strong number");
		}
	}

}
