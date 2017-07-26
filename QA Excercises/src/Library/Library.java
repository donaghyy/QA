package Library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements ContentInterface, PeopleInterface {

	 ArrayList<Content> itemArray = new ArrayList<Content>();
	 ArrayList<People> peopleArray = new ArrayList<People>();
	 
	 public ArrayList<People>  getPA() {
		 return peopleArray;
	 }
	 
	 public ArrayList<Content> getC() {
		 return itemArray;
	 }
	
	public static void main(String[] args) {
		Library l = new Library();
		
		// Content
		Book b1 = new Book (1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book (2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		
		Magazine m1 = new Magazine (3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		Magazine m2 = new Magazine (4, "Magazine", "OK", "Top 10 Summer Tips", 2, 1, false);
		
		Journal j1 = new Journal (5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Journal j2 = new Journal (6, "Journal", "Adam Shahzad", "The Complaining Machine", 23, 1, false, "Life");
		
		// People
		User u1 = new User("u01", "John", "password", 19, "john@outlook.com", 1);
		User u2 = new User("u02", "Peter", "password", 36, "peter@outlook.com", 0);
		User u3 = new User("u03", "Sarah", "password", 22, "sarah@outlook.com", 3);
		Librarian l1 = new Librarian("l01", "Mary", "password");
		
		l.itemArray.add(b1);
		l.itemArray.add(b2);
		l.itemArray.add(m1);
		l.itemArray.add(m2);
		l.itemArray.add(j1);
		l.itemArray.add(j2);
		l.peopleArray.add(u1);
		l.peopleArray.add(u2);
		l.peopleArray.add(u3);
		l.peopleArray.add(l1);
		
		//System.out.println("Please indicate: (1) Search (2) All Records (3) People"+" To Exit (0)");
		
		
		//l.removeItem();
		//l.searchContent();
		//l.searchPeople();
		//l.addContent();
		//l.addPerson();
		//l.searchPeople();
		//l.writeFile();
		
		/*try {
			l.readFile();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}
	
	public void readFile() throws IOException {
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("itemArray-file"));
			String line = br.readLine();
			
			itemArray.clear();
			
			while (line!=null) {
				
				String[] result = line.split("\\,");
				
				int ID = Integer.parseInt(result[0]);
				String cat = result[1];
				String auth = result[2];
				String title = result[3];
				int isleNo = Integer.parseInt(result[4]);
				int rackNo = Integer.parseInt(result[5]);
				boolean status = Boolean.parseBoolean(result[6]);
				
				if (cat.equals("Book")) {
					
					Book b = new Book(ID, cat, auth, title, isleNo, rackNo, status);
					itemArray.add(b);
				}
				if (cat.equals("Magazine")) {
					Magazine m = new Magazine(ID, cat, auth, title, isleNo, rackNo, status);
					itemArray.add(m);
				}
				if (cat.equals("Journal")) {
					Journal j = new Journal(ID, cat, auth, title, isleNo, rackNo, status);
					itemArray.add(j);
				}
				
				line = br.readLine();
				
			}
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File doesnt exist!");
		}
		
		
		printItemArray();
		
	}
	
	public void writeFile() {
		
		try {
				PrintWriter writer = new PrintWriter("itemArray-file", "UTF-8");
			
				for (int i=0; i<itemArray.size(); i++) {
					writer.write(itemArray.get(i).toFile());
				}
				
				writer.close();
		} 
		catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("File write successful");
	}
	
	public void addPerson() {
		
		Scanner sc = new Scanner(System.in);
		
		
		String ID = "";
		int id = peopleArray.size() +1;
		String type = "";
		String name = "";
		String pass = "";
		String ag = "";
		String email = "";
		String noIssued = "";
		
		System.out.println("Create new User, or Librarian?");
		type = sc.nextLine();
		
		
		if (type.equals("Librarian")) {
			ID = "l0"+id;
			System.out.println("Please enter Librarian's name");
			name = sc.nextLine();
			System.out.println("Please enter their password");
			pass = sc.nextLine();
			
			Librarian l = new Librarian (ID, name, pass);
			peopleArray.add(l);
		}
		if (type.equals("User")) {
			ID = "u0"+id;
			System.out.println("Please enter User's name");
			name = sc.nextLine();
			System.out.println("Please enter their password");
			pass = sc.nextLine();
			System.out.println("Please enter the Users age");
			ag = sc.nextLine();
			int age = Integer.parseInt(ag);
			System.out.println("Please enter their email address");
			email = sc.nextLine();
			System.out.println("Please enter current number of items issued");
			noIssued = sc.nextLine();
			int issued = Integer.parseInt(noIssued);
			
			User u = new User(ID, name, pass, age, email, issued);
			peopleArray.add(u);
		}
		
		System.out.println("Person Added");
		
		
		
		
		
	}
	
	public void addContent() {
		
		Scanner sc = new Scanner(System.in);
		int ID = itemArray.size() + 1;
		String cat = "";
		String auth = "";
		String title = "";
		String rackN = "";
		String isleN = "";
		String stat = "";
		String hard = "";
		String page = "";
		
		
		System.out.println("Please enter the item's Category (Book/Magazine/Journal)");
		cat = sc.nextLine();
		
		System.out.println("Please enter the Author");
		auth = sc.nextLine();
		
		System.out.println("Please enter the Title of the item");
		title = sc.nextLine();
		
		System.out.println("Please enter the item's rack number");
		rackN = sc.nextLine();
		int rackNo = Integer.parseInt(rackN);
		
		System.out.println("Please enter the item's isle number");
		isleN = sc.nextLine();
		int isleNo = Integer.parseInt(isleN);
		
		System.out.println("Please enter the item's status (currently issued = false)");
		stat = sc.nextLine();
		boolean status = Boolean.parseBoolean(stat);
		
		if (cat.equals("Book")) {
			System.out.println("Is the item a hardback copy? true/false");
			hard = sc.nextLine();
			boolean hardBack = Boolean.parseBoolean(hard);
			System.out.println("Please enter the items pagecount");
			page = sc.nextLine();
			int pageCount = Integer.parseInt(page);
			
			Book b = new Book(ID, cat, auth, title, rackNo, isleNo, status, hardBack, pageCount);
			itemArray.add(b);
		}
		else if (cat.equals("Magazine")){
			Magazine m = new Magazine(ID, cat, auth, title, rackNo, isleNo, status);
			itemArray.add(m);
		}
		else if (cat.equals("Journal")) {
			System.out.println("Please enter the journals subject");
			String subject = sc.nextLine();
			
			Journal j = new Journal(ID, cat, auth, title, rackNo, isleNo, status, subject);
			itemArray.add(j);
		}
		
		System.out.println("Content added");
		printItemArray();
	}
	
	public void PreAddItem() {
	/*	put all the logic behind the the add content method here, and have the add 
		content method just contain the object and add to array .. so i can test it */
	}
	
	public  void searchContent() {		// Searches an individual item by ID

		System.out.println("Please enter the ID of the item");
		Scanner sc = new Scanner(System.in);

		String temp = sc.nextLine();
		int search = Integer.parseInt(temp);

		

		for (int i = 0; i < itemArray.size() - 1; i++) {

			if (itemArray.get(i).getID() == search) {

				System.out.println(itemArray.get(i).toString());
				System.out.println("________________________");

				//Library.printArray(); // asks if they'd like to print array
				
				System.out.println("Please indicate: (1) Update or (2) Remove");
				int input = sc.nextInt();
				
				if(input == 1) {
					updateItem();
				}
				if(input == 2) {
					removeItemID(search);
				}
				
			}

		}
	}
	
	public void searchPeople() {

		System.out.println("Please enter Name");
		Scanner sc = new Scanner(System.in);

		String search = sc.nextLine();

		for (int i = 0; i < peopleArray.size(); i++) {

			if (peopleArray.get(i).getName().equals(search)) {

				System.out.println(peopleArray.get(i).toString()); // modify toString
				System.out.println("________________________");

				
				if (peopleArray.get(i).getName().equals("Mary")) {
					System.out.println("Please indicate: (1)(2)");
					System.out.println("(1) Update Record" + "\n(2) Delete Record");
				}
				else if(peopleArray.get(i).getName().equals(search)) {
					System.out.println("Please indicate: (1)(2)(3)");
					System.out.println("(1) Update Record" + "\n(2) Delete Record" + "\n(3) Outstanding" 
					+ "\n(4) Issue Content" + "\n(5) Return Content");
				}
				
				
				String temp = sc.nextLine();
				int input = Integer.parseInt(temp);
				
				if (input == 1) {
					String ID = peopleArray.get(i).getpID();
					updatePerson(ID);
				}
				else if (input == 2) {
					String ID = peopleArray.get(i).getpID();
					removePerson(ID);
				}
				else if (input == 3) {
					String ID = peopleArray.get(i).getpID();
					outstandingContent(ID);
				}
				else if (input == 4) {
					String ID = peopleArray.get(i).getpID();
					Librarian l = new Librarian();
					l.issueContent(ID, peopleArray);
				}
				else if (input == 5) {
					String ID = peopleArray.get(i).getpID();
					Librarian l = new Librarian();
					
					l.returnContent(ID, peopleArray); // return too many
					
				}
			}
		}	
	}
	
	public void updatePerson(String ID) {
		for (int j = 0; j<peopleArray.size(); j++) {
			
		if (peopleArray.get(j).getpID() == ID) {

			System.out.println("Please indicate what you want to Update: (1)(2)(3)");
			System.out.println("(1) ID" + "\n(2) Name" + "\n(3) Password");
			
			Scanner sc = new Scanner(System.in);
			String temp = sc.nextLine();
			int input = Integer.parseInt(temp);
			
			if (input == 1) {
				String userInput = sc.nextLine();
				peopleArray.get(j).setID(userInput);
			}
			else if (input == 2) {
				String userInput = sc.nextLine();
				peopleArray.get(j).setName(userInput);
			}
			else if (input == 3) {
				String userInput = sc.nextLine();
				peopleArray.get(j).setPassword(userInput);
			}
			System.out.println("Updated Record: " + peopleArray.get(j).toString()); 		// updated record
			System.out.println("________________________");
		}
	}
	}
	
	public void outstandingContent(String ID) {
		
		for (int i = 0; i < itemArray.size() - 2; i++) {

			if (peopleArray.get(i).getpID() == ID) {

				int issued = ((User)peopleArray.get(i)).getItemsIssued();
				System.out.println("Number of items currently outstanding: " + issued);
				System.out.println("________________________");


			}

		}
	}

	public void removePerson(String ID) {
		
		for (int i = 0; i < peopleArray.size()-1; i++) {

			if (peopleArray.get(i).getpID() == ID) {

				peopleArray.remove(i);
				System.out.println("Record Removed, " + peopleArray.size() + " people in the Array");
				System.out.println("________________________");
				
				
				

			}
			
		}
	}
	
	public void removeItem() {
		System.out.println("Please enter the ID of the item you wish to Remove");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();

		for (int i = 0; i < itemArray.size()-1; i++) {

			if (itemArray.get(i).getID() == search) {

				itemArray.remove(i);
				System.out.println("Item Removed, " + itemArray.size() + " items in the Library");
				System.out.println("________________________");
				
				printItemArray();	// asks if they'd like to print array
				

			}
			
		}
	}
	
	public void removeItemID(int ID) {

		for (int i = 0; i < itemArray.size()-1; i++) {

			if (itemArray.get(i).getID() == ID) {

				itemArray.remove(i);
				System.out.println("Item Removed, " + itemArray.size() + " items in the Library");
				System.out.println("________________________");
				
				printItemArray();	// asks if they'd like to print array
				

			}
			
		}
	}
	
	public void updateItem() {
		
		printItemArray();
		
		System.out.println("\nPlease enter the ID of the item you wish to Update");
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		int temp2 = Integer.parseInt(search);

		for (int i = 0; i < itemArray.size(); i++) {

			if (itemArray.get(i).getID() == temp2) {

			//	ask for info and store as variables, ask if they want to edit 'name'eg
				System.out.println("Please indicate: (1)(2)(3)(4)(5)(6)(7)");
				System.out.println("(1) ID" + "\n(2) Category" + "\n(3) Author"
						+ "\n(4) Title" + "\n(5) Isle Number" + "\n(6) Rack Number"
						+ "\n(7) Status");
				String temp = sc.nextLine();
				int input = Integer.parseInt(temp);
				
				
				if (input == 1) {
					String input2 = sc.nextLine();
					itemArray.get(i).setID(Integer.parseInt(input2));
				}
				else if (input == 2) {
					String input2 = sc.nextLine();
					itemArray.get(i).setCategory(input2);
				}
				else if (input == 3) {
					String input2 = sc.nextLine();
					itemArray.get(i).setAuthor(input2);
				}
				else if (input == 4) {
					String input2 = sc.nextLine();			// Can only read in 1 word
					itemArray.get(i).setTitle(input2);
				}
				else if (input == 5) {
					String input2 = sc.nextLine();
					itemArray.get(i).setIsleNo(Integer.parseInt(input2));
				}
				else if (input == 6) {
					String input2 = sc.nextLine();
					itemArray.get(i).setRackNo(Integer.parseInt(input2));
				}
				else if (input == 7) {
					String input2 = sc.nextLine();
					itemArray.get(i).setStatus(Boolean.parseBoolean(input2));
				}
				
				System.out.println("Updated Record: " + itemArray.get(i).toString()); 		// updated record
				
				
				
				
				System.out.println("________________________");

			}
			
		}
	}

	public void printItemArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to display all records? Y/N");
		String temp = sc.next();
		
		if(temp.contains("Y")) {
			for(int j=0; j< itemArray.size(); j++) {
				System.out.println(itemArray.get(j).toString());
				System.out.println();
			}
		}
		else if (temp.contains("N")) {
			System.out.println("OK.");
		}
	}

	
	

	
}
