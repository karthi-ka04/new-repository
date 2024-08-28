package collections;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachMethod {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		//Consumer c=(b)->System.out.println(b);
		
		a.forEach((b)->System.out.println(b));

	}

}
