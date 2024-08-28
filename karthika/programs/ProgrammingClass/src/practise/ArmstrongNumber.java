package practise;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int temp=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		n=temp;
		while(n>0)
		{
			int d=n%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*d;
			}
			sum=sum+power;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+"is a armstrong number");
		}
		else
		{
			System.out.println(temp+"is not a armstrong number");
		}
	}

}
