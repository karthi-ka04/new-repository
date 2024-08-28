package patternprograms;

public class NumberPyramidIncreasingAndDecreasing {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=1;i<=n;i++) {
			int num=1;
			for(int j=1;j<=(n*2)-1;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					if(j<n) {
						System.out.print(num++ +" ");
					}
					else {
						System.out.print(num--+" ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
