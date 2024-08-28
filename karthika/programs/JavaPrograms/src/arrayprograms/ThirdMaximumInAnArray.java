package arrayprograms;

public class ThirdMaximumInAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
	    int thirdmax=Integer.MIN_VALUE;
	    for(int i=0;i<a.length;i++) {
	    	if(max<a[i]) {
	    		thirdmax=secmax;
	    		secmax=max;
	    		max=a[i];
	    	}
	    	else if(secmax<a[i] && a[i]!=max) {
	    		thirdmax=secmax;
	    		secmax=a[i];
	    	}
	    	else if(thirdmax<a[i] && a[i]!=max && a[i]!=secmax) {
	    		thirdmax=a[i];
	    	}
	    }
	    System.out.println(max);
	    System.out.println(secmax);
	    System.out.println(thirdmax);

	}

}
