package Day39Javareview;

public class CellPhones {
	String brand;
	double screenSize;
	String color;
	double price;
	String model;

	
		public CellPhones() {//set up default values for attibutes
		brand="iPhone";
		model="10";
		screenSize=5.8;
		color="White";
		price=700;
		
		
	}
	
	public void call(int PhoneNumber) {
		System.out.println(brand+" "+model+"is calling"+PhoneNumber);
	}
public void Sendmessage(long PhoneNumber) {
	System.out.println("Sending messages to "+PhoneNumber);
	
}

	public CellPhones(String brand,double price, String color, double screenSize,String model) {//has to be in orde if not will give compile error
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.screenSize=screenSize;
		this.model=model;
	}

public void GetInfo() {
	System.out.println(brand+" "+model+" "+color+" "+screenSize+ " "+"$"+price+" ");
}
}