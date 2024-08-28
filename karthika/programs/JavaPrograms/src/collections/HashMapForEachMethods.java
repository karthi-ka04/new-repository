package collections;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapForEachMethods {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("TP01","ANUSHA");
		hm.put("TP02", "NADHIYA");
		hm.put("TP03", "NIVETHA");
		hm.put("TP04", "VIVEK");
		
		/*BiConsumer b=(key,value)->System.out.println(key+","+value);
		
		hm.forEach(b);*/
		
		hm.forEach((key,value)->System.out.println(key+","+value));
		

	}

}
