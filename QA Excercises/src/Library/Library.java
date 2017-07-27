package Library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements ContentInterface, PeopleInterface {

	 public ArrayList<Content> itemArray = new ArrayList<Content>();
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
		
		//l.searchPeople();
		//l.writeFile();
		//l.requestPersonDetails();		// use this to create people
		//l.requestContentDetails();   //use this to create content
		l.requestUpdateContentDetails();
		
		
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
	
	public void requestPersonDetails() {
		
		int id = 0;
		id = peopleArray.size() +1;
		String type = "";
		
		
		System.out.println("Create new User, or Librarian?");
		type = getInput(type);
		
		if (type.equals("Librarian")) {
			createLibrarian(id);
		}
		else if (type.equals("User")) {
			createUser(id);
		}
		
	}
	
	public void createUser(int id) {
		String name = "";
		String pass = "";
		int age = 0;
		String email = "";
		int noIssued = 0;
		String ID = "u0"+id;
		
		System.out.println("Please enter User's name");
		name = getInput(name);
		System.out.println("Please enter their password");
		pass = getInput(pass);
		System.out.println("Please enter the Users age");
		age = getInput(age);
		System.out.println("Please enter their email address");
		email = getInput(email);
		System.out.println("Please enter current number of items issued");
		noIssued = getInput(noIssued);
		
		
		User u = new User(ID, name, pass, age, email, noIssued);
		addPerson(u);
		
	}
	
	public void createLibrarian(int id) {
		String name = "";
		String pass = "";
		String ID = "l0"+id;
		
		System.out.println("Please enter Librarian's name");
		name = getInput(name);
		System.out.println("Please enter their password");
		pass = getInput(pass);
		
		Librarian l = new Librarian (ID, name, pass);
		addPerson(l);
	}
	

	public void addPerson(Librarian l) {
		
		peopleArray.add(l);
		System.out.println("Librarian Added");
		
		
	}
	
	public void addPerson(User u) {
		
		peopleArray.add(u);
		System.out.println("User Added");
		
	}
	
	public String getInput(String s) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		return s;
	}
	
	public int getInput(int i) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		i = Integer.parseInt(s);
		
		return i;
	}
	
	public void requestContentDetails() {
		int ID = itemArray.size() + 1;
		String cat = "";
		String auth = "";
		String title = "";
		int rackNo = 0;
		int isleNo = 0;
		String stat = "";
		String hard = "";
		int pageCount = 0;
		
		
		System.out.println("Please enter the item's Category (Book/Magazine/Journal)");
		cat = getInput(cat);
		
		System.out.println("Please enter the Author");
		auth = getInput(auth);
		
		System.out.println("Please enter the Title of the item");
		title = getInput(title);
		
		System.out.println("Please enter the item's rack number");
		rackNo = getInput(rackNo);
		
		System.out.println("Please enter the item's isle number");
		isleNo = getInput(isleNo);
		
		System.out.println("Please enter the item's status (currently issued = false)");
		stat = getInput(stat);
		boolean status = Boolean.parseBoolean(stat);
		
		if (cat.equals("Book")) {
			System.out.println("Is the item a hardback copy? true/false");
			hard = getInput(hard);
			boolean hardBack = Boolean.parseBoolean(hard);
			System.out.println("Please enter the items pagecount");
			pageCount = getInput(pageCount);
			
			Book b = new Book(ID, cat, auth, title, rackNo, isleNo, status, hardBack, pageCount);
			addContent(b);
		}
		else if (cat.equals("Magazine")){
			Magazine m = new Magazine(ID, cat, auth, title, rackNo, isleNo, status);
			addContent(m);
		}
		else if (cat.equals("Journal")) {
			String subject = "";
			System.out.println("Please enter the journals subject");
			subject = getInput(subject);
			
			Journal j = new Journal(ID, cat, auth, title, rackNo, isleNo, status, subject);
			addContent(j);
		}
		
	}
	
	public void addContent(Book b) {
		itemArray.add(b);
		System.out.println("Book added");
		//printItemArray();
	}
	public void addContent(Magazine m) {
		itemArray.add(m);
		System.out.println("Magazine added");
		//printItemArray();
	}
	public void addContent(Journal j) {
		itemArray.add(j);
		System.out.println("Journal added");
		//printItemArray();
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
					requestUpdateContentDetails();
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

	public void requestUpdateContentDetails() {
		printItemArray();
		int search =0;
		
		System.out.println("\nPlease enter the ID of the item you wish to Update");
		search = getInput(search);
		int j =0;
		
		for (int i = 0; i < itemArray.size(); i++) {
			j = i;
			
			if (itemArray.get(i).getID() == search) {
				System.out.println("Please indicate: (1)(2)(3)(4)(5)(6)(7)");
				System.out.println("(1) ID" + "\n(2) Category" + "\n(3) Author"
						+ "\n(4) Title" + "\n(5) Isle Number" + "\n(6) Rack Number"
						+ "\n(7) Status");
				
				int input = 0;
				String input2 = "";
				input = getInput(input);
				
				
				if (input == 1) {
					input2 = getInput(input2);
					updateItemID(input2, j);
				}
				else if (input == 2) {
					input2 = getInput(input2);
					updateItemCat(input2, j);
				}
				else if (input == 3) {
					input2 = getInput(input2);
					updateItemAuth(input2, j);
				}
				else if (input == 4) {
					input2 = getInput(input2);
					updateItemTitle(input2, j);
				}
				else if (input == 5) {
					input2 = getInput(input2);
					updateItemIsleNo(input2, j);
				}
				else if (input == 6) {
					input2 = getInput(input2);
					updateItemRackNo(input2, j);
				}
				else if (input == 7) {
					input2 = getInput(input2);
					updateItemStatus(input2, j);
				}
				
			}
		}
	}
	
	public void updateItemStatus(String input, int index) {
		
		itemArray.get(index).setStatus(Boolean.parseBoolean(input));
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

		}
	
	public void updateItemRackNo(String input, int index) {
		
		itemArray.get(index).setRackNo(Integer.parseInt(input));
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

		}
	
	public void updateItemIsleNo(String input, int index) {
		
		itemArray.get(index).setIsleNo(Integer.parseInt(input));
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

		}
	
	public void updateItemTitle(String input, int index) {
		
		itemArray.get(index).setTitle(input);
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

		}
	
	public void updateItemAuth(String input, int index) {
		
		itemArray.get(index).setAuthor(input);
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

		}
	
	public void updateItemCat(String input, int index) {
		
		itemArray.get(index).setCategory(input);
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

		}
	
	public void updateItemID(String input, int index) {
		
		itemArray.get(index).setID(Integer.parseInt(input));
		
		System.out.println("Updated Record: " + itemArray.get(index).toString()); 		// updated record
		System.out.println("________________________");

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
