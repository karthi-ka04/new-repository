package tekpyramid;

import java.util.Scanner;

public class LastWordCountOfCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String s2=s1[s1.length-1];
		int count=0;
		for(int i=0;i<s2.length();i++) {
		       char ch=s2.charAt(i);
		       count++;
		}
		System.out.println(count);
	}

}
