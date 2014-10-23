import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@SuiteClasses({TestEmptyAddressBook.class, TestOneBuddyAddressBook.class, TestTwoAddressBook.class })
@RunWith(Suite.class)
public class AllTests {
	
	
	{ 
	
		/* Add list of classes of test here*/
		TestSuite suite = new TestSuite("Test for com.saorsa.nowplaying.tests");
		suite.addTest(new TestSuite(TestEmptyAddressBook.class));
		suite.addTest(new TestSuite(TestOneBuddyAddressBook.class));
		suite.addTest(new TestSuite(TestTwoAddressBook.class));
	
	}

//	public static void main(String[] args) {
//		junit.textui.TestRunner.run(AllTests.class);
//	}
//
//	public static Test suite() {
//		TestSuite suite = new TestSuite("Test for com.saorsa.nowplaying.tests");
//		suite.addTest(new TestSuite(TestEmptyAddressBook.class));
//		suite.addTest(new TestSuite(TestOneBuddyAddressBook.class));
//		suite.addTest(new TestSuite(TestTwoAddressBook.class));
//		return suite;
//	}

}
