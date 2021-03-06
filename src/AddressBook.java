import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;




public class AddressBook  {
	
	
	
	/**
	 * 
	 */

	private ArrayList<BuddyInfo> buddyList;
	
	/* NOT USED FOR NOW
	private static JList<BuddyInfo> buddyList1;
	DefaultListModel<BuddyInfo> listModel;
	 private static JButton temp;
	 private static JMenuBar menuBar;
	 private JFrame f; 
	 private static JPanel controlPanel;
	 private JLabel statusLabel;
	*/
	/**
	 * constructor
	 */
	public AddressBook()
	{
		buddyList= new ArrayList<BuddyInfo>();
		
//		listModel = new DefaultListModel<>();
//		BuddyInfo buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
//		BuddyInfo buddy2 = new BuddyInfo("Spider", "Ottawa city", 33459);
//		BuddyInfo buddy3 = new BuddyInfo("Ant", "TO city", 11869);
//		listModel.addElement(buddy);
//		listModel.addElement(buddy2);
//		listModel.addElement(buddy3);
//		
//		
//        //create the list
//        buddyList1 = new JList<>(listModel);
//       
//        buddyList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		/**
		 * *** this is from previous lab should be corrected 
		 * DefaultListModel<BuddyInfo> listModel = new DefaultListModel<>();
			BuddyInfo buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
			BuddyInfo buddy2 = new BuddyInfo("Spider", "Ottawa city", 33459);
			BuddyInfo buddy3 = new BuddyInfo("Ant", "TO city", 11869);
			listModel.addElement(buddy);
			listModel.addElement(buddy2);
			listModel.addElement(buddy3);
		
			buddyList1 = new JList<>(listModel);
		
			AddressBookGUI window = new AddressBookGUI(); 
			window.add(buddyList1, BorderLayout.CENTER);
			AddressBookController c = new AddressBookController(window); 
			window.setV(); 
		 */
		
		 
	}
	
	/**
	 * this method return the size of the list 
	 * @return
	 */
	 public int size() {
		 return buddyList.size();
		 }
	 
	 /**
	  * contains method
	  */
	 public boolean contains(BuddyInfo b)
	 {
		 return (buddyList.contains(b)); 
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
	
	//adding method in the branch 
	public void printHello()
	{
		System.out.println("hello im new branch in AddressBook");
	}
	
	/**
	 * export method 
	 * @param args
	 */

	public void export ()
	{
		for(BuddyInfo b: buddyList )
		{
			System.out.println(b.toString());
		}
		
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("myFile.txt"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<=(buddyList.size() -1);i++)
		{
//			String s = buddyList.get(i).getName()+"  "+
//					buddyList.get(i).getAddress()+
//					   "  "+buddyList.get(i).getNumber()+"\n"; 
		String s=buddyList.get(i).toString();
			try {
				out.write(s);
				out.newLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}//end of for 
		
		try {
			out.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	

	public static void main(String[] args)
	{
		

		
		
		BuddyInfo buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
		BuddyInfo buddy2 = new BuddyInfo("Spider", "Ottawa city", 33459);
		BuddyInfo buddy3 = new BuddyInfo("Ant", "TO city", 11869);
		
		BuddyInfo buddy4 = new BuddyInfo("Cake", "Nowhere city", 89007);
		BuddyInfo buddy5 = new BuddyInfo("Bopa", "Loco city", 789345);
		
		AddressBook aBook = new AddressBook();
		aBook.addBuddy(buddy);
		aBook.addBuddy(buddy2);
		aBook.addBuddy(buddy3);
		
		aBook.addBuddy(buddy4);
		aBook.addBuddy(buddy5);
		
		aBook.removeBuddy(1);
		
		
		System.out.println("this is AddressBook class");
		aBook.export();
		
		

	}

	
	

	
	
}


