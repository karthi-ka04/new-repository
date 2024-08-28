package collections;

import java.util.HashMap;

public class HashMapPutMethod {

	public static void main(String[] args) {
	HashMap<String, String> hm=new HashMap<String, String>();
	hm.put("TP01","ANUSHA");
	hm.put("TP02", "NADHIYA");
	hm.put("TP03", "NIVETHA");
	hm.put("TP04", "VIVEK");
	
	System.out.println(hm);
	hm.remove("TP04");
	System.out.println(hm);
	hm.remove("TP03", "NIVETHA");
	System.out.println(hm);
	
	
	

	}

}
