package practise;

public class SquareRoot {
	public static void main(String[] args) {
		int num=9									;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{ 
				flag=true;
				System.out.println(i);
			}
		}
		if(flag==false)
		{
			System.out.println("square root is not found");
		}
	}

}
