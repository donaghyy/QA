package LogicExercises;

import java.util.ArrayList;

public class doubleChar {

	public static void main(String[] args) {
		
		doubleChar c = new doubleChar();
		String input = "hello";
		c.doubleChar(input);
		
	}
	
	public String correct(String input) {
		String returnString = "";
		
		for(int i=0; i<input.length(); i++) {
			returnString += input.charAt(i);
			returnString += input.charAt(i);
		}
		return returnString;
	}
	
	public boolean endsWithLY(String input) {
		return input.endsWith("ly");
	}
	
	public String nTwice(String input, int a) {
		String firstlot ="";
		String lastlot = "";
		
		firstlot = input.substring(0,a);
		lastlot = input.substring(input.length()-a, input.length());
		
		return lastlot;
	}
	

	public void doubleChar(String input) {
		String[] arrayChar =  new String [input.length()];
		
		char temp;
		String s = "";
		String x2 = "";
		
		for (int i=0; i<arrayChar.length; i++) {
			temp = input.charAt(i);
			
			s = Character.toString(temp);
			x2 = s+s;
			
			arrayChar[i] = x2;
			
		}
		
		for(int i = 0; i<arrayChar.length; i++) {
			System.out.println(arrayChar[i].toString());
			arrayChar.toString();
		}
		
	}

	
	// moved onto 2 because of time
	
}
