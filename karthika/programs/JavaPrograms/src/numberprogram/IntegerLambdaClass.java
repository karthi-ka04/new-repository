package numberprogram;

public class IntegerLambdaClass {

	public static void main(String[] args) {
	      IntegerInterface ref=(a,b)->{
	    	  return a+b;
	      };
	      System.out.println(ref.add(2,3));
	      }

}
