package Library;

public interface ContentInterface {
	
	public void searchContent();
	public void removeItem();
	public void removeItemID(int ID);
	
	public void updateItemID(String input, int index);
	public void updateItemCat(String input, int index);
	public void updateItemAuth(String input, int index);
	public void updateItemTitle(String input, int index);
	public void updateItemIsleNo(String input, int index);
	public void updateItemRackNo(String input, int index);
	public void updateItemStatus(String input, int index);

}
