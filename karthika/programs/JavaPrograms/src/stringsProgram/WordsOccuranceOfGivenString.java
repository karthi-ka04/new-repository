package stringsProgram;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordsOccuranceOfGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string sentence");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>() ;
		for(int i=0;i<s1.length;i++) {
			String str=s1[i];
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
		}

	}


