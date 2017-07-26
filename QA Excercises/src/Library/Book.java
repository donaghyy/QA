package Library;

public class Book extends Content{

	private boolean hardBack;
	private int pageCount;
	
	public Book(int iD, String category, String author, String title, int isleNo, 
			int rackNo, boolean status, boolean hardBack, int pageCount) 
	{
		super(iD, category, author, title, isleNo, rackNo, status);
		this.hardBack = hardBack;
		this.pageCount = pageCount;
		
	}
	
	// constructor for reading from file
	public Book(int iD, String cat, String auth, String title, int isleNo, int rackNo, boolean status) {
		super(iD, cat, auth, title, isleNo, rackNo, status);
	}

	public boolean isHardBack() {
		return hardBack;
	}

	public void setHardBack(boolean hardBack) {
		this.hardBack = hardBack;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\n____________________________________";
	}
	
	

	

}
