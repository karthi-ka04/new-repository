package arrayprograms;

import java.util.Arrays;

public class leftRotation {

	public static void main(String[] args) {
		String[]s= {"my","name","is","dora"};
		
		for(int i=1;i<=3;i++) {
			String temp=s[0];
			for(int j=0;j<s.length-1;j++) {
				s[j]=s[j+1];
			}
			s[s.length-1]=temp;
		}
		System.out.println(Arrays.toString(s));

	}

}
