 package stringsProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InArrayRemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,4,1,5};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int b=a[i];
			if(map.containsKey(b)) {
				map.put(b, map.get(b)+1);
			}
			else {
				map.put(b, 1);
			}
		}
		for(Map.Entry<Integer, Integer> data:map.entrySet()) {
			System.out.println(data.getKey());
		}

	}

}
