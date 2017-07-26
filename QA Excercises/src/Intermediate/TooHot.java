package Intermediate;

public class TooHot {

	public static void main(String[] args) {
		
		System.out.println(tooHot(99, true));
	}
	
	public static boolean tooHot(int temp, boolean isSummer) {
		boolean result = false;
		int upperLimit = 90;
		
		// in summer the upper limit is increased
		if(isSummer == true) {
			upperLimit = 100;
		}
		
		if(temp < 60) {
			result = false;
		}
		else if(temp >= 60 && temp <= upperLimit) {
			result =  true;
		}
		
		return result;
	}

}
