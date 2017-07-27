package Library;

public abstract class Content {
	
	private int ID;
	private String category;
	private String author;
	private String title ;
	private int isleNo;
	private int rackNo;
	private boolean status;
	
	
	public Content(int iD, String category, String author, String title, 
			int isleNo, int rackNo, boolean status) 
	{
		super();
		ID = iD;
		this.category = category;
		this.author = author;
		this.title = title;
		this.isleNo = isleNo;
		this.rackNo = rackNo;
		this.status = status;
	}
	
	
	
	
	
	public void displayContentDetails() {
		return;
	}
	
	public void updateStatus() {
		return;
	}
	
	
	
	// Getters and Setters ___________________________________________
	
	@Override
	public String toString() {
		return "ID: " + ID + ", category: " + category + ", author: " + author + ", "+"\n"
	+ "title: " + title + ", isleNo: " + isleNo + ", rackNo: " + rackNo + ", status: " + status ;
	}
	
	public String toFile() {
		return ID + "," + category + "," + author + "," + title + "," + isleNo + "," + rackNo + "," + status + "\n";	//how am i seperating records??
	}
	
	



	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean s) {
		this.status = s;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getIsleNo() {
		return isleNo;
	}


	public void setIsleNo(int isleNo) {
		this.isleNo = isleNo;
	}


	public int getRackNo() {
		return rackNo;
	}


	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}
	
	
	

}
