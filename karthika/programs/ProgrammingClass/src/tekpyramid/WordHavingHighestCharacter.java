package tekpyramid;

import java.util.Scanner;

public class WordHavingHighestCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		String[]s1=s.split(" ");
		String max= s1[0];
		for(int i=1;i<s1.length;i++) {
			String str=s1[i];
			if(max.length()<str.length()) {
				max=str;
			}
		}
		System.out.println(max);

	}

}
