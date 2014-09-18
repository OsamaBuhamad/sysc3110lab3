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
		if(b != null)
		buddyList.add(b);
	}
	
	/**
	 * this method will remove an instance of buddy from the buddyList
	 * @param b
	 */
	public void removeBuddy(int index)
	{
		if(index >=0 && index < buddyList.size())
		buddyList.remove(index);
	}
	

	
	

	public static void main(String[] args)
	{
		System.out.println("this is AddressBook class");
		
		BuddyInfo buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
		BuddyInfo buddy2 = new BuddyInfo("Spider", "Volcano city", 87869);
		BuddyInfo buddy3 = new BuddyInfo("Ant", "Volcano city", 87869);
		
		AddressBook aBook = new AddressBook();
		aBook.addBuddy(buddy);
		aBook.addBuddy(buddy2);
		aBook.addBuddy(buddy3);
		aBook.removeBuddy(1);
		
		
		
		
	}
}
