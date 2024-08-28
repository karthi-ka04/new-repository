package tekpyramid;

public class Student {
   String name;
   long id;
   String address;
   
   public Student(String name,long id,String address) {
      this.name=name;
      this.id=id;
      this.address=address;
}
   public void display() {
	   System.out.println(name+" "+id+" "+address+" ");
   }
   public static void main(String[] args) {
	Student s1=new Student("aadhira", 1456, "krpuram,bangalore");
	s1.display();
	Student s2=new Student("nivetha", 1765, "electroniccity,bangalore");
	s2.display();
	Student s3=new Student("mei", 1342, "sarjapur,bangalore");
	s3.display();
	
}

}
