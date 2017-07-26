package Paint2;

import java.util.ArrayList;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) {
		
		Paint CheapoMax = new Paint("CheapoMax", 20, 19.99, 10);
		Paint AverageJoes = new Paint("AverageJoes", 15, 17.99, 11);
		Paint DuluxourousPaints = new Paint ("DuluxourousPaints", 10, 25, 20);
		
		Paint[] arrayOfPaints = {CheapoMax, AverageJoes, DuluxourousPaints};
		ArrayList<Float> priceArray = new ArrayList<Float>();
		ArrayList<Double> wasteArray = new ArrayList<Double>();
		
		System.out.println("Please enter the size of the room (m2)");
		Scanner sc = new Scanner(System.in);		// asks user for room size
		int roomSize = sc.nextInt();
		
		for (Paint p : arrayOfPaints) {
			
			double paintNeeded = roomSize / p.getTinCoverage();
			double tinsNeeded = Math.ceil(paintNeeded);
			
			double totalPrice = tinsNeeded*p.price;
			p.finalPrice = totalPrice;
			
			priceArray.add((float) totalPrice); // adding results to priceArray
			
			
			if (tinsNeeded < 1) {
				totalPrice = p.price;	// You can buy a minimum of 1 tin
			}
			
			double waste = (tinsNeeded - paintNeeded)*p.volume; // in litres
			wasteArray.add(waste);	// adding results to wasteArray
			
			System.out.println("£" + totalPrice + " ("+tinsNeeded+" Tins) "+p.getBrand());
			System.out.println("Waste: "+ waste + " l\n");
		}
			
		System.out.println("_______________");
		
		Float num = (float) 1000000;
		double temp = 0;
		String cheapBrand = "";
		String wasteBrand = "";
		
		for (int i =0; i< priceArray.size(); i++) {
			if(num > priceArray.get(i)) {
				num = priceArray.get(i);
				
				arrayOfPaints[i].finalPrice = num;
				cheapBrand = arrayOfPaints[i].getBrand();
				temp = num;
			}
			
		}
		
		System.out.println(cheapBrand + ", £" +temp);
		
		double num2 = 1000000;
		double temp2 = 0;
		
		for (int i = 0; i < wasteArray.size(); i++) {
			if(num2 > wasteArray.size()) {
				num2 = wasteArray.get(i);
				
				arrayOfPaints[i].waste = num2;
				wasteBrand = arrayOfPaints[i].getBrand();
				temp2 = num2;
			}
		}
		
		System.out.println(wasteBrand + ", waste's the least with " +temp2+ " litres");
		
		
		
		
		
		
		
		
		
		
		
		/*double temp = arrayOfPaints[1].getFinalPrice();
		double temp2 = arrayOfPaints[1].getWaste();
		String cheapBrand = "";
		String wasteBrand = "";
		
		for (int i = 0; i < (arrayOfPaints.length-1); i++) {
			
			if (temp > arrayOfPaints[i+1].finalPrice) {
				temp = arrayOfPaints[i+1].finalPrice;
				cheapBrand = arrayOfPaints[i+1].getBrand();
			}
			
			if ( temp2 > arrayOfPaints[i+1].getWaste()) {
				temp2 = arrayOfPaints[i+1].getWaste();
				wasteBrand = arrayOfPaints[i+1].getBrand();
			}
			
		}
		
		System.out.println("Cheapest: " + cheapBrand + ", price: " + Math.ceil(temp));
		System.out.println(wasteBrand + ", waste: " + temp2);*/
	}

	
}
