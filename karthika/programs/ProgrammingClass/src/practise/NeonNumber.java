package practise;

public class NeonNumber {
	public static void main(String[] args) {
		int num=8;
		int square=num*num;
		int sum=0;
		while(square>0)
		{
			int d=square%10;
			sum=sum+d;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.println(num+"is a neon number");
		}
		else
		{
			System.out.println(num+"is not a neon number");
		}
		
	}

}
