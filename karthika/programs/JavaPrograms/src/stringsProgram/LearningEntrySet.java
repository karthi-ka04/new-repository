package stringsProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearningEntrySet {

	public static void main(String[] args) {
		HashMap< String, Integer> map=new HashMap<>();
		map.put("dh", 07);
		map.put("vk", 18);
		map.put("rs", 45);
		
		for(Map.Entry<String, Integer> data:map.entrySet()) {
			System.out.print(data.getKey()+"-");
			System.out.print(data.getValue());
			System.out.println();
			System.out.print(data.getKey()+"-");
			System.out.print(data.getValue());
			System.out.println();
			
		}

	}

}
