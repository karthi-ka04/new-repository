package stringsProgram;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WithoutUsingLengthMethodReverseTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		int i = 0;
		String rev = "";
		try {
			for (;;) {
				char ch = s.charAt(i);
				rev = ch + rev;
				i++;
			}
		} catch (Exception e) {
			System.out.println(rev);
		}
	}
}
