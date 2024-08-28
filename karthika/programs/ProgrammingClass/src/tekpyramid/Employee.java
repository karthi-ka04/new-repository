package tekpyramid;

public class Employee {

	long id;
	double salary;
	String department;
	
	public Employee(Long id,double salary,String department) {
		this.id=id;
		this.salary=salary;
		this.department=department;
	}
	
	@Override
	public String toString() {
		return id+" "+salary+" "+department;
		
	}
	@Override
	public boolean equals(Object o){
		Employee e=(Employee)o;
		return this.id==e.id&&this.salary==e.salary&&this.department.equals(e.department);
	}
	public void display() {
		System.out.println(id+" "+salary+" "+department);
	}
	public static void main(String[] args) {
	    Employee e1=new Employee(12l,30000, "software testing");
	    e1.display();
        Employee e2=new Employee(23l, 50500, "software developer");
        e2.display();
        System.out.println(e1==e2);
	}

}
