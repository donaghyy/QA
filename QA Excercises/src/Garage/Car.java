package Garage;

public class Car extends Vehicle {

	String colour;
	String wheelDrive;
	boolean needsServiced;
	String shape;
	int topSpeed;
	
	// Constructor
	public Car (String make, String model, String type, int year, int mileage, String colour, String wheelDrive, 
			String shape, int topSpeed, boolean needsServiced, double tyrePrice, int noOfWheels) 
	{
		
		super(make, model, type, year, mileage);
		
		this.colour = colour;
		this.wheelDrive = wheelDrive;
		this.shape = shape;
		this.topSpeed = topSpeed;
		this.needsServiced = needsServiced;
		this.tyrePrice = tyrePrice;
		this.noOfWheels = noOfWheels;
	}
	

	@Override
	public void start() {
		System.out.println("Makes Car Sound");
		
	}
	
	public String getBill() {
		return (this.make+" "+this.model+", type: "+this.type+", "+this.year+
				"\nThe total bill is £"+(noOfWheels*tyrePrice));
	}
	
	
	public String displayDetails() {
		return (this.wheelDrive+", "+this.shape+", "+this.mileage+" miles, "+"TopSpeed: "+this.topSpeed+" mph");
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
