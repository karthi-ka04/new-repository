package stringsProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingMapPrintUnqiueCharacterInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		for(Map.Entry<Character, Integer> data:map.entrySet()) {
			if(data.getValue()==1) {
				System.out.println(data.getKey());
			}
		}
	}

}
