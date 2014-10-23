import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class TestEmptyAddressBook  {
	private AddressBook addressBook;

	@Before
	public void setUp() {
		 addressBook = new AddressBook();
	
		}
	
	@Test
	public void testSize() {
		 assertEquals("Size of empty Address book should be 0.", 0, addressBook.size()); 
		 }
	
	

}
