import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class TestTwoAddressBook  {
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
	public void testSizeAfterAddingTwo() {
		
		 addressBook.addBuddy(buddy);
		 addressBook.addBuddy(buddy2);
		 assertEquals("Size of empty Address book should be 2.", 2, addressBook.size());
	}
	
	@Test
	public void testContents() {
		
		addressBook.addBuddy(buddy);
		 addressBook.addBuddy(buddy2);
		 assertTrue("List should contain buddy.", addressBook.contains(buddy));
		 assertTrue("List should contain buddy2.", addressBook.contains(buddy2));
		 assertFalse("List should not contain fakeBuddy.", addressBook.contains(fakeBuddy));
		}

	
	
		

		 

}
