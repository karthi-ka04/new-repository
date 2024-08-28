package arrayprograms;

public class SecondMaximumInAnArray {

	public static void main(String[] args) {
		int a[]= {12,4,3,2};
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				secmax=max;
				max=a[i];
			}
			else if(secmax<a[i] && a[i]!=max) {
				secmax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		
		

	}

}
