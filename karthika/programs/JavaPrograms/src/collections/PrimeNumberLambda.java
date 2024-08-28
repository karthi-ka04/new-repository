package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public class PrimeNumberLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> hm=new ArrayList<Integer>();
	    hm.add(1);
	    hm.add(3);
	    hm.add(2);
	    hm.add(6);
	    
	   Consumer a=(b)->{
		   int count=0;
		   for(int i=1;i<=(Integer)b;i++) {
			   if((Integer)b%i==0) {
				   count++;
			   }
			}
	    if(count==2) {
	    	System.out.println(b);
	    }
	 };
	hm.forEach(a);
 
	}

}
