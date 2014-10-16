import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class AddressBookController implements ActionListener {
	
	private JList<BuddyInfo> buddyList1;
	DefaultListModel<BuddyInfo> listModel;
	//private BuddyInfo buddy; 
	private AddressBookGUI window;
	AddressBookController(AddressBookGUI w)
	{ 
		window =w; 
		listModel = new DefaultListModel<>();
		//create the list
        buddyList1 = new JList<>(listModel);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Action Command : " + e.getActionCommand());
		if ("Create an Address Book?".equals(e.getActionCommand()))
		{
			//AddressBook aNewBook = new AddressBook();
			//AddressBookPanel p= new AddressBookPanel();
			String inputValue = JOptionPane.showInputDialog("Please Enter the Address Book Name");
				System.out.println("the input is "+inputValue);
				//temp.setText("Adderss book created");
				
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
			//buddyList.add(b);
			listModel.addElement(b);
			System.out.println("a buddy was added to the book! his/her info: "+inputValue+", "+inputValue2+", "+inputValue3);
			//System.out.println("the size of the book is :"+buddyList.size());
			//temp.setText("buddy was added");
			
		}else if ("Save the Address Book".equals(e.getActionCommand())){
			
			
			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter("myFile.txt"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(int i=0;i<=(listModel.size() -1);i++)
			{
				String s = listModel.get(i).getName()+"  "+
						listModel.get(i).getAddress()+
						   "  "+listModel.get(i).getNumber()+"\n"; 
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
						
			//temp.setText("Address book was outputted to a file ");
			
		} else if ("Display the Address Book".equals(e.getActionCommand())){
			
			
			//  JTextArea textArea = new JTextArea();
			 // for(BuddyInfo s: listModel)
			//  {
				 // textArea.append(s.getName()+"  "+s.getAddress()+"  "+s.getNumber());
			//	  textArea.append(s.toString()+"\n");
			//	  statusLabel.setText( textArea.getText());
		//	  }
		//	  //controlPanel.add(commentTextArea);
			  //statusLabel.setText( textArea.getText());
		//	  temp.setText("Displayed to window");	
		//	System.out.println(buddyList.toString());
			System.out.println(listModel.toString()); 
			//AddressBookGUI window = new AddressBookGUI(); 
			window.add(buddyList1, BorderLayout.CENTER);
			//window.setV();
		}
		else if ("remove buddy".equals(e.getActionCommand())){
			
			  int index = buddyList1.getSelectedIndex();
			    if(index >= 0){ //Remove only if a particular item is selected
			        listModel.removeElementAt(0);
			        listModel.remove(0);
			    }
			//System.out.println(listModel.toString()); 
			//AddressBookGUI window = new AddressBookGUI(); 
			//window.add(buddyList1, BorderLayout.SOUTH);
			//window.setV();
		}
		
	}

}
