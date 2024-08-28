package tekpyramid;

import java.util.Scanner;

public class AddTheNumberInTheGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the given string");
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(ch >='0'&& ch<='9') {
        		int num=ch;
        		sum=sum+(num-48);
           }
        }
        System.out.println(sum);
	}

}
