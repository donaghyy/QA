package Paint2;

public class Paint {
	
	String Brand;
	double volume;
	double price;
	double coverage;
	
	double finalPrice;
	double waste;
	
	public Paint(String brand, double volume, double price, double coverage ) {
		
		Brand = brand;
		this.volume = volume;
		this.price = price;
		this.coverage = coverage;
		
	}
	
	public double getTinCoverage() {
		return(coverage*volume);
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double getWaste() {
		return waste;
	}

	public void setWaste(double waste) {
		this.waste = waste;
	}
	
	
	
	

}
