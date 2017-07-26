package Garage;

public class Van extends Vehicle {

	String Colour;
	String wheelDrive;
	boolean needsServiced;
	int topSpeed;

	// Constructor
	public Van(String make, String model, String type, int year, int mileage, String colour, String wheelDrive,
			boolean needsServiced, int topSpeed, double tyrePrice, int noOfWheels) {
		super(make, model, type, year, mileage);

		this.Colour = colour;
		this.wheelDrive = wheelDrive;
		this.needsServiced = needsServiced;
		this.topSpeed = topSpeed;
		
		this.tyrePrice = tyrePrice;
		this.noOfWheels = noOfWheels;
	}

	@Override
	public void start() {
		System.out.println("Makes Van Noise");

	}
	
	public String getBill() {
		return (this.make+" "+this.model+", type: "+this.type+", "+this.year+
				"\nThe total bill is £"+(noOfWheels*tyrePrice));
	}
	
	
	public String displayDetails() {
		return (this.Colour+", "+this.wheelDrive+", "+this.mileage+" miles, "+"TopSpeed: "+this.topSpeed+" mph");
	}
	
	public String requiresService() {
		
		if(this.needsServiced == true) {
			return("This vehicle requires a service.");
		}
		else {
			return("This vehicle does not require a service.");
		}
		
	}

}
