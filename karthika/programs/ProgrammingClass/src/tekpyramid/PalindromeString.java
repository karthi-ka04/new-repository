package tekpyramid;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine().toLowerCase();
		String s1[]=s.split(" ");
		String temp=s1[0];
		String temp1=s1[s1.length-1];
		while(temp.length() < temp1.length()) {
			
			
			
		}
		
		
		
		
		
		boolean flag=false;
		/*for(int i=s1.length-1;i>=0;i--) {
			String str=s1[i];
			for(int j=str.length()-1;j>=0;j--) {
				char ch=str.charAt(j);
				if(ch>='a'&& ch<='z') {
					flag=true;
					rev=rev+ch;
				}
				else {
					flag=false;
				}
			}
		}
		System.out.println(rev);
		if(flag==true) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}*/

	}

}
