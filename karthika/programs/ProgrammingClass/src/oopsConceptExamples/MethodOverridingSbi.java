package oopsConceptExamples;

public class MethodOverridingSbi  extends MethodOverridingBank{

	public void getRateOfInterestForHousingLoan() {
		System.out.println("The rate of interest is 10%");
		
    }
	 public void  getRateOfInterestForCarLoan() {
		   System.out.println("the rate of interest is 5%");
	}
	public static void main(String[] args) {
		MethodOverridingBank mo=new MethodOverridingSbi();
		mo.getRateOfInterestForHousingLoan();
		mo.getRateOfInterestForCarLoan();
	}
}
