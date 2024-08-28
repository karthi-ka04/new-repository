package oopsConceptExamples;

public class EncapsulationBank {
	
	private int balance=1000;
	private int pincode=1431;
	
	public int  getBalance() {
		
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public static void main(String[] args) {
		EncapsulationBank eb=new EncapsulationBank();
		System.out.println(eb.getBalance());
		eb.setBalance(2000);
		System.out.println(eb.getBalance());
		
		System.out.println(eb.getPincode());
		eb.setPincode(1506);
		System.out.println(eb.getPincode());
		
	}

}
