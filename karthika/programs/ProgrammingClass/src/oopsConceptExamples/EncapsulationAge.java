package oopsConceptExamples;

public class EncapsulationAge {
	
	private int age=5;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public static void main(String[] args) {
		EncapsulationAge ea=new EncapsulationAge();
		System.out.println(ea.getAge());
		ea.setAge(10);
		System.out.println(ea.getAge());
	}

}
