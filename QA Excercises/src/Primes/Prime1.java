package Primes;

public class Prime1 {

	public static void main(String[] args) {
		
		int lower =  1;
		long upper = 3000000;
		long startTime = System.currentTimeMillis();
		
		int primesAmt = 0;
		
		for(int i= lower; i<upper; i++) {
			
			if(isPrime(i)) {
				primesAmt++;
			}
		}
		
		System.out.println(primesAmt + " Prime Numbers");
		long endTime = System.currentTimeMillis();
		System.out.println("Calculation time: " + (endTime-startTime) + "ms");
	}

	public static boolean isPrime(int i) {
		
		for(int j=2; j < Math.sqrt(i); j++) {
			if(i%j == 0) {
				return false;
			}
		}
		
		return true;
	}

	//

}
