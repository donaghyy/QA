package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends People {

	public Librarian(String ID, String name, String password) {
		super(ID, name, password);
	}
	public Librarian() {
		super();
	}
	
	Library l = new Library();
	
	
	
	public void issueContent(String ID, ArrayList<People> p) {
		
		ArrayList<People> pa = p;
		int Issued = 0;
		int temp = 0;
		for(int i = 0; i< pa.size(); i++) {
			
			
			
			if((pa.get(i).getpID()).equals(ID)) {
				
				Issued = ((User)pa.get(i)).getItemsIssued();
				temp = Issued + 1;
				
				((User)pa.get(i)).setItemsIssued(ID, temp);
				
				System.out.println("Item issued." + "\nUpdated number of items issued: "+temp);
				
			}
			
		}
		
	}
	
	public void returnContent(String ID, ArrayList<People> p) {
		
		ArrayList<People> pa = p;
		int Issued = 0;
		int temp = 0;
		for(int i = 0; i< pa.size(); i++) {
			
			
			
			if((pa.get(i).getpID()).equals(ID)) {
				
				Issued = ((User)pa.get(i)).getItemsIssued();
				temp = Issued - 1;
				
				if(Issued<1) {
					System.out.println("User does not have any outstanding items to return!");
				}
				else {
					((User)pa.get(i)).setItemsIssued(ID, temp);
					System.out.println("Item returned." + "\nUpdated number of items issued: "+temp);
				}
			
				
				
				
			}
			
			
		}
	}
	@Override
	public String toString() {
		return "\nID: " + this.getpID() + "\nName: " + this.getName() + "\nPassword: "+this.getPassword() + "\n____________________________________";
	}
	
	
	
	

	
	
	
	
	
}
