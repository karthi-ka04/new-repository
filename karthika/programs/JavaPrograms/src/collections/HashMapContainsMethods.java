package collections;

import java.util.HashMap;

public class HashMapContainsMethods {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,2);
		hm.put(2, 3);
		hm.put(3,4);
		
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue(7));
		System.out.println(hm.containsKey(3));
	 	System.out.println(hm.containsValue(4));
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.isEmpty());

	}

}
