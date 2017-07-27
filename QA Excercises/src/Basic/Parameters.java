package Basic;

public class Parameters {

	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		boolean c = true;
		
		Conditional(a, b, c);
		
	}

	public static int Conditional(int a, int b, boolean c) {
		int result;
		
		
		if( a == 0) {
			result = b;
		}
		if( b == 0) {
			result = a;
		}
		
		if (c == true) {
			result = a+b;
		}
		else {
			result = a*b;
		}
		
		System.out.println(result);
		return result;
	}
}
