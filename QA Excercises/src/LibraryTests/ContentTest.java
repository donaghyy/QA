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
	
	@Before
	public void setContent() {
		ArrayList<Content> itemArray = new ArrayList<Content>();
		// Content
		Book b1 = new Book(1, "Book", "James Dickerson", "The Mediocore Summer", 12, 4, true, true, 1000);
		Book b2 = new Book(2, "Book", "Sarah Howell", "Die Python Die", 16, 2, false, false, 847);

		Magazine m1 = new Magazine(3, "Magazine", "Hello", "Are You Smarter Than OJ?", 2, 2, true);
		Magazine m2 = new Magazine(4, "Magazine", "OK", "Top 10 Summer Tips", 2, 1, false);

		Journal j1 = new Journal(5, "Journal", "Bugzy Malone", "Journal of an Evil Genius", 22, 4, true, "Music");
		Journal j2 = new Journal(6, "Journal", "Adam Shahzad", "The Complaining Machine", 23, 1, false, "Life");

		itemArray.add(b1);
		itemArray.add(b2);
		itemArray.add(m1);
		itemArray.add(m2);
		itemArray.add(j1);
		itemArray.add(j2);
	}

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
	public void testAddItem() {
		Magazine m3 = new Magazine(3, "Magazine", "Hello", "Are You Smart?", 2, 2, true);
		
	}
	
	@Test
	public void testRemoveItem() {
		
	}
	
	@Test
	public void testUpdateItem() {
		
	}
	
	@Test
	public void testSearchItem() {
		
	}

}
