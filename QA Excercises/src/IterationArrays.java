
public class IterationArrays {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		boolean c = true;

		int[] arrayOfInts = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// how many times do you want the result to be printed | 0=1
		int loopNo = 0;

		 
		// UNCOMMENT THE METHODS BELOW TO OUTPUT TO CONSOLE
		
		//Conditional(arrayOfInts[0], arrayOfInts[8], c, loopNo);

		 //loopAndRead();
		 populateArray();

	}
	
	

	public static void populateArray() {
		int[] arrayOfInts = new int[5];
		int val = 1;
		
		for (int i=0; i<arrayOfInts.length; i++) {
			
			arrayOfInts[i] = val;
			val++;
			System.out.println("The value of this element is: "+arrayOfInts[i]);
			
			//System.out.println("The multiplication is: "+(arrayOfInts[i]*10));
			//System.out.println("________________________");
			
		}
		
		for (int j=0; j< arrayOfInts.length; j++) {
			int value = arrayOfInts[j];
			int newVal = value*10;
			arrayOfInts[j] = newVal;
			
			System.out.println("The multiplication is: "+arrayOfInts[j]);
			System.out.println("________________________");
		}
		

		
	}
	public static void loopAndRead() {
		int[] arrayOfInts = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arrayOfInts.length; i++) {
			System.out.println("This element of the array is: " + arrayOfInts[i]);
		}
	}

	public static int Conditional(int a, int b, boolean c, int d) {

		int result;
		int loopNo = d;

		if (a == 0) {
			result = b;
		}
		if (b == 0) {
			result = a;
		}

		if (c == true) {
			result = a + b;
		} else {
			result = a * b;
		}

		// This loops the result
		for (int i = 0; i <= loopNo; i++) {
			System.out.println(result);
		}

		return result;
	}
}
