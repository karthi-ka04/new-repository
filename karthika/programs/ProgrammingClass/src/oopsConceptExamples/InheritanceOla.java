package oopsConceptExamples;



public class InheritanceOla extends InheritanceCab {
		
		 public void showJourneyDetails() {
			 System.out.println("details of the journey of price ,destination,startingpoint");
		 }
		 public void isCabAvailable() {
			 System.out.println("checking the cab is available or not");
		 }
	    public static void main(String[] args) {
			InheritanceOla io=new InheritanceOla();
			io.bookCab();
			io.cancelCab();
			io.showJourneyDetails();
			io.isCabAvailable();
		}

}


