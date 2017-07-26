package Library;

public class User extends People{
	
	
	
	private int age;
	private String email;
	private int itemsIssued;
	
	public User(String ID, String name, String password, int age, String email, int itemsIssued) {
		super(ID, name, password);
		
		this.age = age;
		this.email = email;
		this.itemsIssued = itemsIssued;
	}
	
	@Override
	public String toString() {
		return "\nID: " + getpID() + "\nName: " + getName() + "\npassword: " + getPassword() + "\nCurrent Items Issued: " + itemsIssued
				  + "\n____________________________________";
	}
	
	public void registerUser() {
		return;
	}
	
	public void deleteUser() {
		return;
	}
	
	public void updateUser() {
		return;
	}

	// Getters and Setters ___________________________________________
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getItemsIssued() {
		return itemsIssued;
	}

	public void setItemsIssued(String iD, int itemsIssued) {
		this.itemsIssued = itemsIssued;
	}
	
	
	
	

}
