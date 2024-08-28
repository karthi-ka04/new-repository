package arrayprograms;

public class SecondManimumInAnArray {

	public static void main(String[] args) {
       int a[]= {12,23,56,12,78,67};
       int min=Integer.MAX_VALUE;
       int secmin=Integer.MAX_VALUE;
       
       for(int i=0;i<a.length;i++) {
    	   if(min>a[i]) {
    		   secmin=min;
    		   min=a[i];
    	   }
    	   else if(secmin>a[i] && a[i]!=min) {
    		   secmin=a[i];
    	   }
    }
       System.out.println(min);
       System.out.println(secmin);

	}

}
