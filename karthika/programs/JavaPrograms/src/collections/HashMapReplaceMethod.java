package collections;

import java.util.HashMap;

public class HashMapReplaceMethod {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("TP01","ANUSHA");
		hm.put("TP02", "NADHIYA");
		hm.put("TP03", "NIVETHA");
		hm.put("TP04", "VIVEK");
		
		System.out.println(hm);
		hm.replace("TP04", "BALAJI");
		System.out.println(hm);
		hm.replace("TP04","BALAJI","VIVEK");
		System.out.println(hm);

		
	}

}
