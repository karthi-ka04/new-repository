package stringsProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingMapRemoveDuplicateInString {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch)+1);
				}else {
					map.put(ch,1);
				}
			}
			for(Map.Entry<Character, Integer> data:map.entrySet()) {
					System.out.print(data.getKey());
				}
			}

	}


