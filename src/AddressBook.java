import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*; 



public class AddressBook extends JFrame implements ActionListener {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	 private static JButton temp;
	 private static JMenuBar menuBar;
	
	/**
	 * constructor
	 */
	public AddressBook()
	{
		JFrame f =  new JFrame("Address book frame");
	      f.setSize(500, 500);
	      f.setLayout(new BorderLayout());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	     
	      temp = new JButton("Hello!");
	      temp.setBackground(Color.white);
	       temp.addActionListener(this);
	        f.getContentPane().add(temp, BorderLayout.SOUTH);
	    

	      
	      JMenuBar menuBar = new JMenuBar( );
	      f.setJMenuBar(menuBar);

	      JMenu createMenu = new JMenu( "Create" );
	      menuBar.add( createMenu );
	      JMenu saveMenu = new JMenu( "Save" );
	      menuBar.add( saveMenu );
	      JMenu displayMenu = new JMenu( "Display" );
	      menuBar.add( displayMenu );
	      
	      
	      JMenuItem item;
	 	 
	      item = new JMenuItem ( "Create an Address Book?" );
	      item.addActionListener( this );
	      createMenu.add( item );
	      item = new JMenuItem ( "Create a Buddy?" );
	      item.addActionListener( this );
	  	  createMenu.add( item );   
	  	  
	  	item = new JMenuItem ( "Save the Address Book" );
	      item.addActionListener( this );
	      saveMenu.add( item );
	      
	      item = new JMenuItem ( "Display the Address Book" );
	      item.addActionListener( this );
	  	  displayMenu.add( item ); 
	  	  
	  	  
			f.setVisible(true);
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

	
	

	public static void main(String[] args)
	{
		

		BuddyInfo buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
		BuddyInfo buddy2 = new BuddyInfo("Spider", "Volcano city", 87869);
		BuddyInfo buddy3 = new BuddyInfo("Ant", "Volcano city", 87869);
		
		BuddyInfo buddy4 = new BuddyInfo("Cake", "Nowhere city", 89007);
		BuddyInfo buddy5 = new BuddyInfo("Bopa", "Loco city", 789345);
		
		AddressBook aBook = new AddressBook();
		aBook.addBuddy(buddy);
		aBook.addBuddy(buddy2);
		aBook.addBuddy(buddy3);
		
		aBook.addBuddy(buddy4);
		aBook.addBuddy(buddy5);
		
		aBook.removeBuddy(1);
		

		  

		      
		     // f.getContentPane().add(menuBar);
		      //menuBar.setVisible(true);
		      
		    //  JTextField tf = new JTextField(20);         
		     // tf.setBackground(Color.red);

		      // Don't allow the user to type in the
		      // text field
		     // tf.setEditable(false);
		    //  tf.setSize(50, 50);
		    //  f.add(tf);

	

		System.out.println("this is AddressBook class");
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("Create an Address Book?".equals(e.getActionCommand()))
		{
			AddressBook aNewBook = new AddressBook();
			//AddressBookPanel p= new AddressBookPanel();
			String inputValue = JOptionPane.showInputDialog("Please Enter the Address Book Name");
			
				System.out.println("the input is "+inputValue);
				temp.setText("Adderss book created");
				
		}else if ("Create a Buddy?".equals(e.getActionCommand()))
		{
			
			//JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
			
			
			String inputValue = JOptionPane.showInputDialog("Please Enter the Buddy Name");
			String inputValue2 = JOptionPane.showInputDialog("Please Enter the Address ");
			String inputValue3 = JOptionPane.showInputDialog("Please Enter the number");
			int foo = Integer.parseInt(inputValue3);
			BuddyInfo b= new BuddyInfo(inputValue,inputValue2,foo);	
			//AddressBook aNewBook = new AddressBook();
			//aNewBook.addBuddy(inputValue);
			buddyList.add(b);
			System.out.println("a buddy was added to the book! his/her info: "+inputValue+", "+inputValue2+", "+inputValue3);
			System.out.println("the size of the book is :"+buddyList.size());
			temp.setText("buddy was added");
			
		}else if ("Save the Address Book".equals(e.getActionCommand())){
			
			//System.out.println("it is "+ buddyList.get(5).getName());
			
			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter("myFile.txt"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(int i=0;i<=(buddyList.size() -1);i++)
			{
				String s = buddyList.get(i).getName()+"  "+
						   buddyList.get(i).getAddress()+
						   "  "+buddyList.get(i).getNumber()+"\n"; 
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
						
			temp.setText("Address book was outputted to a file ");
			
		} else if ("Display the Address Book".equals(e.getActionCommand())){
			
			System.out.println("DISPLAY THE BOOK");
			System.out.println(buddyList.toString());
			
		}
      
		//temp.setText("GOT IT");
		
	}
	

	
	
}


