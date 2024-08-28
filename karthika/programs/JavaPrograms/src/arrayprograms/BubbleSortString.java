package arrayprograms;

import java.util.Arrays;

public class BubbleSortString {

	public static void main(String[] args) {
		String s[]= {"my","name","is","nivetha"};
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j].compareTo(s[j+1])>0) {
				String temp=s[j];
			     s[j]=s[j+1];
			     s[j+1]=temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(s));

	}

}
