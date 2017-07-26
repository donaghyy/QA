package Intermediate;

public class Person {

	String name = "";
	int age = 0;
	String jobTitle = "";

	public Person(String personName, int personAge, String personJobTitle) {
		name = personName;
		age = personAge;
		jobTitle = personJobTitle;
				
	}
	
	public String displayDetails() {
		
		return(this.name + " is "+this.age+ " years old, and is a "+this.jobTitle+"." + "\n");
	}
	
	public static void main (String[] args) {
		
		personArray();
		
	}
	
	public static void personArray() {
		
		Person David = new Person("David", 21, "Consultant");
		//System.out.println(David.displayDetails());
		
		Person Mary = new Person("Mary", 42, "Librarian");
		//System.out.println(Mary.displayDetails());
		
		Person John = new Person("John", 19, "Student");
		//System.out.println(John.displayDetails());
		
		Person Noel = new Person("Noel", 35, "Salesman");
		//System.out.println(Noel.displayDetails());
		
		Person Sarah = new Person("Sarah", 27, "Hairdresser");
		
		
		Person[] arrayOfPeople = { David, Mary, John, Noel, Sarah};
		
		for(int i=0; i<arrayOfPeople.length; i++) {
			System.out.println(arrayOfPeople[i].displayDetails());
		}
	}
}
