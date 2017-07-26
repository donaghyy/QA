package Garage;

public abstract class Vehicle {
	
	
	String make;
	String model;
	String type;
	int year;
	int mileage;
	
	int noOfWheels;
	double tyrePrice;
	
	public boolean vehicleSearch(String search) {
		return this.make == search;
		
	}
	
	public String getID() {
		return make;
	}
	
	public Vehicle (String make, String model, String type, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.type = type;
		this.year = year;
		this.mileage = mileage;
	}
	
	public String displayModel() {
		return (this.make+" "+this.model+", type: "+this.type+", "+this.year);
	}
	
	public abstract void start();
	
	public String getBill() {
		return (this.make+" "+this.model+", type: "+this.type+", "+this.year+
				"\nThe total bill is £"+(noOfWheels*tyrePrice));
	}
	
	
	
	
}



