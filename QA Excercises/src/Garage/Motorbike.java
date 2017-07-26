package Garage;

public class Motorbike extends Vehicle {

	String colour;
	boolean needsServiced;
	int topSpeed;

	// Constructor
	public Motorbike(String make, String model, String type, int year, int mileage, String colour, 
			boolean needsServiced, int topSpeed, double tyrePrice, int noOfWheels) 
	{
		super(make, model, type, year, mileage);
		
		this.colour = colour;
		this.needsServiced = needsServiced;
		this.topSpeed = topSpeed;
		
		this.tyrePrice = tyrePrice;
		this.noOfWheels = noOfWheels;
	}

	@Override
	public void start() {
		System.out.println("Makes Motorbike Sound");

	}

	public String getBill() {
		return (this.make+" "+this.model+", type: "+this.type+", "+this.year+
				"\nThe total bill is £"+(noOfWheels*tyrePrice));
	}

	public String displayDetails() {
		return (this.colour + ", " + this.mileage + " miles, " + "TopSpeed: " + this.topSpeed + " mph");
	}

	public String requiresService() {

		if (this.needsServiced == true) {
			return ("This vehicle requires a service.");
		} else {
			return ("This vehicle does not require a service.");
		}

	}
}
