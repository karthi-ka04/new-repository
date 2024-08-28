package collections;

import java.util.HashMap;

public class HashMapKeySetMethods {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("TP01","ANUSHA");
		hm.put("TP02", "NADHIYA");
		hm.put("TP03", "NIVETHA");
		hm.put("TP04", "VIVEK");
		
		System.out.println(hm.keySet());//gives only the key and return type is set<key>
		System.out.println(hm.values());//gives only values in the collections
		System.out.println(hm.entrySet());//gives both key and values  
		
	

	}

}
