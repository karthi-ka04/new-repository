package tekpyramid;

import java.util.Scanner;

public class FindTheIndexOfTheGivenCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
        String s=sc.next();
        System.out.println("enter the chracter");
        char ch=sc.next().charAt(0);
        String s1="";
        int index=0;
        for(int i=0;i<s.length();i++) {
        char ch1=s.charAt(i);
        if(s1.indexOf(ch1)==-1 && ch1!=' ') {
        if(ch==ch1) {
          index=s.indexOf(ch1);
        	 }
        }
        }
        System.out.println(index);

	}


}
