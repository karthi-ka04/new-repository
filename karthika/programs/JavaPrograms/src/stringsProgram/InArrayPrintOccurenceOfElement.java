package stringsProgram;

import java.util.LinkedHashMap;

public class InArrayPrintOccurenceOfElement {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,4,1,5};
		LinkedHashMap<Integer, Integer> hp=new LinkedHashMap<>();
		
		for(int i=0;i<a.length;i++) {
	       int b=a[i];
	       if(hp.containsKey(b)) {
	    	   hp.put(b, hp.get(b)+1);
	       }
	       else {
	    	   hp.put(b,1);
	       }
		}
		System.out.println(hp);

	}

}
