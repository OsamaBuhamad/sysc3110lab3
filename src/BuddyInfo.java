import java.util.Scanner;


public class BuddyInfo {
	
	private  String name;
	private  String address;
	private int number;
	
	public BuddyInfo(String name, String address, int number){
		
		setName(name);
		setAddress(address);
		setNumber(number);
	}
	
	
	public BuddyInfo() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args)
	{

		BuddyInfo person= new BuddyInfo("Homer", "Ottawa", 911);
	
		System.out.println(person.toString());
		
		BuddyInfo person2= new BuddyInfo();
		person2=BuddyInfo.imporT("homer$ottawa$112");
		
		System.out.println(person2.toString());
//		System.out.println("Hello World!");
//		System.out.println("my friend is " + person.getName() + " his number is "+person.getNumber()+ " and his address is "+ person.getAddress() );
//		
//		System.out.println("I added this message from GITHUB!!!!");

	}//end of main
	
	/**
	 * import method from lab 7
	 * @return
	 */
	public static BuddyInfo imporT(String s)
	{
		BuddyInfo b=new BuddyInfo();
		 Scanner in = new Scanner(s).useDelimiter("\\$");
		 b.setName(in.next());
		 b.setAddress(in.next());
		 b.setNumber(in.nextInt());
	     in.close(); 
	    
		return b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public boolean equals(BuddyInfo b)
	{
		if(this.equals(b))
			return true;
		else 
			return false;
	}
	
	public String toString(){
		
		return (""+this.getName()+ "$"+ this.getAddress()+"$"+this.getNumber());	
	}
}
