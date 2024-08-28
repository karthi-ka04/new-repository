package arrayprograms;

public class FirstMaximiumInAnArray {

	public static void main(String[] args) {
         int a[]= {4,-3,5,9};
         int max=Integer.MIN_VALUE;
         for(int i=0;i<a.length;i++) {
        	 if(max<a[i]) {
        		 max=a[i];
        	 }
         }
         System.out.println(max);

	}

}
