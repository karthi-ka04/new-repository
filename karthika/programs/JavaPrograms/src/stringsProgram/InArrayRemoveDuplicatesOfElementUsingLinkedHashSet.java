package stringsProgram;

import java.util.LinkedHashSet;

public class InArrayRemoveDuplicatesOfElementUsingLinkedHashSet {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,4,1,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int c:set) {
			System.out.println(c);
		}

	}

}
