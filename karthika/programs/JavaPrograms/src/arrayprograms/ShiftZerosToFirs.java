package arrayprograms;

public class ShiftZerosToFirs {

	public static void main(String[] args) {
      int a[]= {1,2,0,0,3,4,0};
      int []result=new int[a.length];
      int index=result.length-1;
      for(int i=a.length-1;i>=0;i--) {
    	  if(a[i]!=0) {
    		  result[index--]=a[i];
    	  }
      }
      for(int i:result) {
    	  System.out.println(i);
      }

	}

}
