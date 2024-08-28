package arrayprograms;

import java.util.Arrays;

public class ReverseAnArrayWithoutUsingLengthVariable {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 54, 67 };
		int b = 0;
		int i = 0;
		try {
			while (true) {

				b = a[i] + b;
				i++;
			}
		} catch (Exception e) {
             
		}

	}

}
