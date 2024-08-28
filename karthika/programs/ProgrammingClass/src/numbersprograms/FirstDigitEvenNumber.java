package numbersprograms;

import java.util.Scanner;

public class FirstDigitEvenNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		while(num>=10)//or num>9
		{
			num=num/10;
		}
		if(num%2==0)
		{
			System.out.println(num+"is a even number");
		}
		else
		{
			System.out.println(num+"is not a even number");
		}
		
	}

}
