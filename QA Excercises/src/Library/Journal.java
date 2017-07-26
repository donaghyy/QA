package Library;

public class Journal extends Content {

	private String subjects;
	
	public Journal(int iD, String category, String author, String title, 
			int isleNo, int rackNo, boolean status, String subject) 
	{
		super(iD, category, author, title, isleNo, rackNo, status);
		this.subjects = subject;
	}

	// constructor for reading from file
	public Journal(int iD, String cat, String auth, String title, int isleNo, int rackNo, boolean status) {
		super(iD, cat, auth, title, isleNo, rackNo, status);
	}

	@Override
	public String toString() {
		return super.toString()+ "\nSubject: " + this.subjects + 
				"\n____________________________________";
	}
	
	

	
	
}
