package numberprogram;

public  class DemoClassLambda {

	public static void main(String[] args) {
		DemoInterface di=()->{
			System.out.println("Hello");
			System.out.println("World");
		};
		di.demo();
		
		DemoInterface di1=()->System.out.println("Welcome");
		di1.demo();  
		
		
		
	}

}
