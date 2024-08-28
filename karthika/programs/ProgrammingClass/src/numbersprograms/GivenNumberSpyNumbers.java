package numbersprograms;

public class GivenNumberSpyNumbers {
	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int product=1;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			product=product*d;
			n=n/10;
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum==product)
		{
			System.out.println("The Given Number a is spy number");
		}
		else
		{
			System.out.println("The Given Number is not a spy number");
		}
	}

}
