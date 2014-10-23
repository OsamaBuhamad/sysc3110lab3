import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class TestOneBuddyAddressBook  {

	private AddressBook addressBook = null;
	private BuddyInfo buddy = null;
	 private BuddyInfo buddy2 = null;
	 BuddyInfo fakeBuddy = null;
	 
	 @Before
	 public void setUp() {
		 addressBook = new AddressBook();
		 buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
		 buddy2 = new BuddyInfo("Spider", "Ottawa city", 33459);
		 fakeBuddy= new BuddyInfo("Ghost","NOWHERE",0000);
		}

	
	
	
	@Test
	public void testSizeAfterAddingOne() {
		 addressBook.addBuddy(buddy);
		 assertEquals("Size of empty Address book should be 1.", 1, addressBook.size());
	}
	
	
	@Test
	public void testContents() {
		
		addressBook.addBuddy(buddy);
		 
		 assertTrue("List should contain buddy.", addressBook.contains(buddy));
		 assertEquals("Size of empty Address book should be 1.", 1, addressBook.size());
		}

	
	
		

}
