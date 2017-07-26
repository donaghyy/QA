package PeerProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Garage.Vehicle;

public class NumberGuessing {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int max = 100;
		int randomNum = randomNumber(min, max);
		int Guess = randomNum;
		int newMin = 0;
		int newMax = 0;
		
		int temp = Guess;
		
		System.out.println("My first guess is "+ randomNum);
		System.out.println("Please indicate (H)igher, (L)ower, or (C)orrect");
		
		String s = sc.nextLine();
		
		while (!(s.equals("C"))) {
			
			
			
			if(s.equals("H")){
				newMin = Guess;
				int newGuess = randomNumber(newMin, max);
				
				temp = newGuess;
				
			}
			else if(s.equals("L")) {
				newMax = Guess;
				int newGuess = randomNumber(min, newMax);
				temp = newGuess;
				
			}
			else {
				System.out.println("Please indicate (H)igher, (L)ower, or (C)orrect");
			}
			
			
			System.out.println("Is the number "+temp+"?");
			s = sc.nextLine();
			
			
		}
		System.out.println("______________________");
		System.out.print("\nThank you for playing :)\n"+ "Better luck next time!");
		
	}
	
	
	public static int randomNumber(int minVal, int maxVal) {
		
		return (int) Math.ceil(minVal + (Math.random()*maxVal));
	}

}
