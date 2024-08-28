package practise;

public class SpyNumbers {
	public static void main(String[] args) {
		int n=145;
		int temp=n;
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
			System.out.println(temp+"is a spy number");
		}
		else
		{
			System.out.println(temp+" is not a spy number");
		}
	}

}
