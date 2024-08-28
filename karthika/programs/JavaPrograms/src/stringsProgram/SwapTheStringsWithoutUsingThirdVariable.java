package stringsProgram;

public class SwapTheStringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String s1="java";
		String s2="api";
		//before swapping		
		System.out.println("before swapping");
		System.out.println("the value of s1 :"+s1);
		System.out.println("the value of s2:"+ s2);
		
		//AfterSwapping
		System.out.println("after swapping");
		s1=s1+s2;//javaapi-->7
		s2=s1.substring(0,(s1.length()-s2.length()));//java-->4
		s1=s1.substring(s2.length());//api-->3
		
		System.out.println("after swapping");
		System.out.println("the value of s1 :"+s1);
		System.out.println("the value of s2:"+ s2);
		
		
		

	}

}
