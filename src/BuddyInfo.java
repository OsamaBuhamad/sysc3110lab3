
public class BuddyInfo {
	
	private  String name;
	private  String address;
	private int number;
	
	public BuddyInfo(String name, String address, int number){
		
		setName(name);
		setAddress(address);
		setNumber(number);
	}
	
	
	public static void main(String[] args)
	{

		BuddyInfo person= new BuddyInfo("Homer", "Ottawa", 911);
	
		
		System.out.println("Hello World!");
		System.out.println("my friend is " + person.getName() + " his number is "+person.getNumber()+ " and his address is "+ person.getAddress() );
		
		System.out.println("I added this message from GITHUB!!!!");

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
	
	//adding method in the branch
	public void printHi()
	{
		System.out.println("hi im new branch in BuddyInfo");
	}
}
