package PeerProgramming;

import java.util.Scanner;

public class Factorials {

	public static void main (String[] args) {
		
		System.out.println("Please define n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int i = 1;	// the incremental number
		double k = n;
		
		while (k != 1) 
		{
			i = i+1;
			k = (k/i);
			
			if(k < 1) {
				System.out.println("That is not a factorial");
				break;
			}
			
		}
		
		if (k == 1) 
		{
			System.out.println("n is equal to "+ i + "!");
		}
		
	}
	
}
