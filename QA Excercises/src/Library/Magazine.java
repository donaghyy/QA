package Library;

public class Magazine extends Content{

	
	
	public Magazine(int iD, String category, String author, String title, 
			int isleNo, int rackNo, boolean status) 
	{
		super(iD, category, author, title, isleNo, rackNo, status);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\n____________________________________";
	}

}
