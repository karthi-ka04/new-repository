package stringsProgram;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UsingSetRemoveDuplicatesInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		LinkedHashSet<Character> map=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			map.add(s.charAt(i));
			
		}
		for(Character c:map) {
			System.out.print(c);
		
		}
	}

}
