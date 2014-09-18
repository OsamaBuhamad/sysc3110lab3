import java.util.ArrayList;


public class AddressBook {
	
	private ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	/**
	 * constructor
	 */
	public AddressBook()
	{
		
	}
	
	/**
	 * this method will add an instance of buddy to the buddyList arrayList
	 * @param b
	 */
	public void addBuddy(BuddyInfo b)
	{
		buddyList.add(b);
	}
	
	/**
	 * this method will remove an instance of buddy from the buddyList
	 * @param b
	 */
	public void removeBuddy(BuddyInfo b)
	{
		buddyList.remove(b);
	}
	
	public void main(String[] args)
	{
		System.out.println("this is AddressBook class");
	}
}
