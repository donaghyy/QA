package Library;

public abstract class People {

	private String ID; 	//L01 & U01
	private String name;
	private String password;
	
	public People(String iD, String name, String password) {
		ID = iD;
		this.name = name;
		this.password = password;
	}
	
	

	// Getters and Setters ___________________________________________
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "\nID: " + ID + "\nName: " + name + "\npassword: " + password;
	}



	public String getpID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
