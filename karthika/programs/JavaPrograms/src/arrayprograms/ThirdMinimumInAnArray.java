package arrayprograms;

public class ThirdMinimumInAnArray {

	public static void main(String[] args) {
		int a[] = { 0, -1, -2, 4, 5 };
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		int thirdmin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				thirdmin = secmin;
				secmin = min;
				min = a[i];
			} else if (secmin > a[i] && a[i] != min) {
				thirdmin = secmin;
				secmin = a[i];
			} else if (thirdmin > a[i] && a[i] != min && a[i] != secmin) {
				thirdmin = a[i];
			}
		}
		System.out.println(min);
		System.out.println(secmin);
		System.out.println(thirdmin);
	}

}
