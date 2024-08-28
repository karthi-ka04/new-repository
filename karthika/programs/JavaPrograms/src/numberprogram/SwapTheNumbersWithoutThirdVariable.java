package numberprogram;

public class SwapTheNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//before swapping
		System.out.println("before swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		//after swapping
		System.out.println("after swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);

	}

}
