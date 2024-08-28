package numberprogram;

public class DemoClassLambdaWithFormalArguments {

	public static void main(String[] args) {
		
		DemoInterface1 di=(a,b)->{
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
		};
		di.demo(2,3);
		di.demo(4,5);
		
		DemoInterface1 di1=(a,b)->{
			System.out.println(a+b);
		};
		di1.demo(5, 5);

	}

}
