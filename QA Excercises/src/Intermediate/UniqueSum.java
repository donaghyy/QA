package Intermediate;

public class UniqueSum {

	public static void main(String[] args) {

		System.out.println(UniqueSum(1, 4, 5));

	}

	public static int UniqueSum(int a, int b, int c) {
		int result;

		if (a == b && a == c) {
			return 0;
		}

		if (a == b) {
			return c;
		} else if (b == c) {
			return a;
		} else if (a == c) {
			return b;
		}

		result = a + b + c;

		return result;
	}

}
