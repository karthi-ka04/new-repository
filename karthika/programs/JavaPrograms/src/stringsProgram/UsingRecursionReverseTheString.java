package stringsProgram;

import java.util.Scanner;

public class UsingRecursionReverseTheString {

	public static void Reverse(String s) {
		if(s.length()>=1) {
			System.out.print(s.charAt(s.length()-1));
		      Reverse(s.substring(0,s.length()-1));
		}
		
	}
	
		

	public static void main(String[] args) {
		Reverse("india");
	}

}
