package arrayprograms;

public class LengthOfArrayWithoutUsingLengthVariable {

	public static void main(String[] args) {
		int a[]= {12,4,5,32,7,6,5,3};
		int i=0;
		int count=0;
		try {
		while(true) {
			
			int b=a[i];
			i++;
			count++;
		}
		}
		catch(Exception e){		
		  System.out.println(count);
		}
	
	
	}

	

}
