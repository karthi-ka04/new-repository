package arrayprograms;

public class ShiftZerosToLast {

	public static void main(String[] args) {
		int a[]={1,2,0,0,3,4,0};
		int[] result=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
				result[index++]=a[i];
			}
		}
		for(int b:result) {
			System.out.print(b+" ");
		}
		

	}

}
