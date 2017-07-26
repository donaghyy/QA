package Garage;

import java.util.Scanner;

import java.util.ArrayList;

public class Garage {

	static ArrayList<Vehicle> vehicle = new ArrayList();

	public void addVehicle(Vehicle temp) {
		vehicle.add(temp);
	}

	public static void getBillMake() {

		Scanner sc = new Scanner(System.in);
		String search = sc.next();

		for (Vehicle v : vehicle) {

			if (v.getID().contains(search) && v.getID() != null) {

				System.out.println(v.getBill());

			}
		}
	}

	public static void removeByMake() {
		Scanner sc = new Scanner(System.in);
		String search = sc.next();

		for (int i = 0; i < vehicle.size(); i++) {

			if (vehicle.get(i).getID().contains(search) && vehicle.get(i).getID() != null) {

				vehicle.remove(i);
				System.out.println("Vehicle Removed, " + vehicle.size() + " vehicles in Garage");

			}
			
		}
	}

	public static void main(String[] args) {

		// Vehicles
		Car a = new Car("VW", "Golf", "Car", 1995, 1750000, "Yellow", "FWD", "Hatchback", 155, false, 42.5, 4);
		Motorbike b = new Motorbike("Kawasaki", "Ninja", "Motorbike", 1998, 95000, "Red", true, 185, 125, 2);
		Van c = new Van("Peugeot", "Expert", "Van", 2008, 68000, "White", "RWD", false, 130, 65.7, 4);
		Car d = new Car("Honda", "Civic", "Car", 2003, 112000, "Silver", "FWD", "Hatchback", 155, true, 200, 4);

		Garage garage = new Garage();

		garage.addVehicle(a);
		garage.addVehicle(b);
		garage.addVehicle(c);
		garage.addVehicle(d);

		getBillMake();

		removeByMake();


	}
}
