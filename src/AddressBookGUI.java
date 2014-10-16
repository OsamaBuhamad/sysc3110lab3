import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class AddressBookGUI extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JButton temp;
	 private static JMenuBar menuBar;
	 private JFrame f; 
	 private static JPanel controlPanel;
	 private JLabel statusLabel;
	 private AddressBookController c; 
	 private static JList<BuddyInfo> buddyList1;
	 
	public AddressBookGUI(){
		c = new AddressBookController(this); 
		f= new JFrame("Address book frame");
	      f.setSize(500, 500);
	      f.setLayout(new BorderLayout());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 //     f.add(buddyList1, BorderLayout.CENTER);
	     
	      temp = new JButton("Hello!");
	      temp.setBackground(Color.white);
	      // temp.addActionListener(this);
	        f.getContentPane().add(temp, BorderLayout.SOUTH);
	      
	      JMenuBar menuBar = new JMenuBar( );
	      f.setJMenuBar(menuBar);

	      JMenu createMenu = new JMenu( "Create" );
	      menuBar.add( createMenu );
	      JMenu editMenu = new JMenu( "Edit" );
	      menuBar.add( editMenu );
	      JMenu displayMenu = new JMenu( "Display" );
	      menuBar.add( displayMenu );
	      
	      
	      JMenuItem item;
	 	 
	      item = new JMenuItem ( "Create an Address Book?" );
	      item.addActionListener(c);
	      createMenu.add( item );
	      item = new JMenuItem ( "Create a Buddy?" );
	      item.addActionListener(c);
	  	  createMenu.add( item );   
	  	  
	  	item = new JMenuItem ( "Save the Address Book" );
	      item.addActionListener( c );
	      editMenu.add( item );
	      item = new JMenuItem ( "remove buddy" );
	      item.addActionListener( c );
	      editMenu.add( item );
	      item = new JMenuItem ( "edit buddy" );
	      item.addActionListener( c );
	      editMenu.add( item );
	      
	      item = new JMenuItem ( "Display the Address Book" );
	      item.addActionListener( c );
	  	  displayMenu.add( item ); 
	  	  
	 // 	 controlPanel = new JPanel();
	  //    controlPanel.setLayout(new FlowLayout());
	      
	   //   f.add(controlPanel);
	      
	     // statusLabel = new JLabel("",JLabel.CENTER);    
	     // statusLabel.setSize(350,100);
	     // f.add(statusLabel);
	  	  
//	  	DefaultListModel<BuddyInfo> listModel = new DefaultListModel<>();
//		BuddyInfo buddy = new BuddyInfo("Hulk", "Volcano city", 87869);
//		BuddyInfo buddy2 = new BuddyInfo("Spider", "Ottawa city", 33459);
//		BuddyInfo buddy3 = new BuddyInfo("Ant", "TO city", 11869);
//		listModel.addElement(buddy);
//		listModel.addElement(buddy2);
//		listModel.addElement(buddy3);
//		 buddyList1 = new JList<>(listModel);
//		
//		f.add(buddyList1, BorderLayout.CENTER);
	  	  
			f.setVisible(true);
		
	}
	
	
	public void setV(){
		setVisible(true);
	}

}
