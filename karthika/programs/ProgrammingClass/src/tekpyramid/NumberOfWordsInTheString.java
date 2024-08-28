package tekpyramid;

import java.util.Scanner;

public class NumberOfWordsInTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        int count=0;
        for(int i=0;i<s1.length;i++) {
        	count++;
        }
        System.out.println(count);

	}

}
