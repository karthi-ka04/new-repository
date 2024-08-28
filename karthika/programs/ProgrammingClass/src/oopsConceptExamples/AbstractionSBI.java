package oopsConceptExamples;

public class AbstractionSBI extends AbstractionAtm {
		
		public void withdraw() {
			System.out.println("amount is withdrawned");
		}
		public void checkbalance() {
			System.out.println("To check the amount of balance");
		}
		public void  transfermoney() {
			System.out.println("Amount is transferred");
		}
		public void creditingamount() {
			System.out.println("money is credited");
		}
		
		public static void main(String[] args) {
			AbstractionAtm ab=new AbstractionSBI();
			ab.withdraw();
			ab.checkbalance();
			ab.creditingamount();
			ab.transfermoney();
		}
	}



