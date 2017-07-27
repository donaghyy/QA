/**
 * 
 */
package LibraryTests;
import Library.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ContentTest {
	
	/*@BeforeClass
	public static void setContent() {
		Library l = new Library();
		ArrayList<Content> itemArray = l.itemArray;
		
		// Content
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);

		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		Magazine m2 = new Magazine(4, "Magazine", "OK", "Top 10 Summer Tips", 2, 1, false);

		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Journal j2 = new Journal(6, "Journal", "Adam Shahzad", "The Complaining Machine", 23, 1, false, "Life");

		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
	}*/

	@Test
	public void testPageCount() {
		Book testBook = new Book(1, "Book", "Jimmy Jebus", "This is Title", 
				42, 3, true, true, 420);
		
		assertEquals(testBook.getPageCount(), 420);
	}
	
	@Test
	public void testHardBack() {
		Book testBook = new Book(1, "Book", "Jimmy Jebus", "This is Title", 
				42, 3, true, true, 420);
		
		assertEquals(testBook.isHardBack(), true);
	}
	
	@Test
	public void testUpdateStatus() {
		Book testBook = new Book(1, "Book", "Jimmy Jebus", "This is Title", 
				42, 3, true, true, 420);
		assertTrue(testBook.getStatus());
	}
	
	@Test
	public void testAddMagazine() {
		Magazine m = new Magazine(3, "Magazine", "Hello", "Are You Smart?", 2, 2, true);
		Library l = new Library();

		int arraySizeB = l.itemArray.size();
		
		l.addContent(m);	// referencing the wrong thing
		
		int arraySizeA = l.itemArray.size();
		
		
		assertEquals(arraySizeB + 1, arraySizeA);
		
	}
	
	@Test
	public void testAddBook() {
		Book b = new Book(1, "Book", "Jimmy Jebus", "This is Title", 42, 3, true, true, 420);
		Library l = new Library();
		
		int arraySizeB = l.itemArray.size();
		l.addContent(b);
		int arraySizeA = l.itemArray.size();

		assertEquals(arraySizeB + 1, arraySizeA);
		
	}
	
	@Test
	public void testAddJournal() {
		Journal j = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Library l = new Library();

		int arraySizeB = l.itemArray.size();
		l.addContent(j);
		int arraySizeA = l.itemArray.size();
		
		assertEquals(arraySizeB + 1, arraySizeA);
	}
	
	@Test
	public void testRemoveItem() { 		
		
		Library l = new Library();
		
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		int sizeB = l.itemArray.size();
		l.removeItemID(5);
		int sizeA = l.itemArray.size();
		
		assertEquals(sizeB-1, sizeA);
		
		
	}
	
	@Test
	public void testUpdateItemID() {
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		int BeforeID = l.itemArray.get(1).getID();
		
		l.updateItemID("9999", 1);
		int AfterID = l.itemArray.get(1).getID();
		
		assertEquals(9999, AfterID);
		
	}
	
	@Test
	public void testUpdateItemCat() {
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		String BeforeCat = l.itemArray.get(1).getCategory();
		System.out.println("\nBefore Category: "+BeforeCat);
		l.updateItemCat("TEST CATEGORY", 1);
		String AfterCat = l.itemArray.get(1).getCategory();
		
		assertEquals("TEST CATEGORY", AfterCat);
		
	}
	
	@Test
	public void testUpdateItemAuth() {
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		String BeforeAuth = l.itemArray.get(1).getAuthor();
		System.out.println("\nBefore Author: "+BeforeAuth);
		l.updateItemAuth("TEST AUTHOR", 1);
		String AfterAuth = l.itemArray.get(1).getAuthor();
		
		assertEquals("TEST AUTHOR", AfterAuth);
		
	}
	
	@Test
	public void testUpdateItemTitle() {		
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		String BeforeTitle = l.itemArray.get(1).getTitle();
		System.out.println("\nBefore Title: "+BeforeTitle);
		l.updateItemTitle("TEST TITLE", 1);
		String AfterTitle = l.itemArray.get(1).getTitle();
		
		assertEquals("TEST TITLE", AfterTitle);
		
	}
	
	@Test
	public void testUpdateItemIsleNo() {	
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		int BeforeIsleNo = l.itemArray.get(1).getIsleNo();
		System.out.println("\nBefore IsleNo: "+BeforeIsleNo);
		l.updateItemIsleNo("99999", 1);
		int AfterIsleNo = l.itemArray.get(1).getIsleNo();
		
		assertEquals(99999, AfterIsleNo);
		
	}
	
	@Test
	public void testUpdateItemRackNo() {		
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		int BeforeRackNo = l.itemArray.get(1).getRackNo();
		System.out.println("\nBefore RackNo: "+BeforeRackNo);
		l.updateItemRackNo("99999", 1);
		int AfterRackNo = l.itemArray.get(1).getRackNo();
		
		assertEquals(99999, AfterRackNo);
		
	}
	
	@Test
	public void testUpdateItemStatus() {		
		Library l = new Library();
		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);
		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		l.addContent(j1);
		l.addContent(b1);
		l.addContent(b2);
		l.addContent(m1);
		
		boolean BeforeStatus = l.itemArray.get(1).getStatus();
		System.out.println("\nBefore Status: "+BeforeStatus);
		l.updateItemStatus("false", 1);
		boolean AfterStatus = l.itemArray.get(1).getStatus();
		
		assertEquals(false, AfterStatus);
		
	}
	

}
