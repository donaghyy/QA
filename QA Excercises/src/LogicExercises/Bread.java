package LogicExercises;

import java.util.ArrayList;

public class Bread {

	public static void main(String[] args) {
		
		String input = "breadjambread";
		
		getSandwich(input);
	}
	
	public static void getSandwich(String input) {
		ArrayList<String> s = new ArrayList();
		
		
		String s1 = input;
		String s2 = "bread";
		
		if(s1.contains(s2)) {
			for(int i =0; i<s.size(); i++) {
				//s1.charAt(i);
				System.out.println("true");
			}
			System.out.println("true");
		}
		
	}
	
	
	
}
