package arrayprograms;

public class FirstMinimumInAnArray {

	public static void main(String[] args) {
		int a[]= {12,3,-1,-2};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
