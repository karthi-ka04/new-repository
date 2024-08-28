package patternprograms;

public class NumberIncreasingAndDecreasingWithSpaceLogic {

	public static void main(String[] args) {
		
		int n=3;
		for(int i=1;i<=n;i++) {
			//print space
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			//print number increase
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			//print number decrease
			for(int l=i-1;l>=1;l--) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		

	}

}
