package Day37Classandobjects;

public class Car {
	/*
	 * car
	 * data/attribute
	 * 	model,year,brand,color,price,mileage,VIN
	 * ACTIONS: 
	 * 		start, driver, accelerate,stop drift,brake,get ticket
	 */

	String Model;
	int Year;
	String Brand;
	String Color;
	double Price;
	long Milage;
	
	
	public void drive() {
		System.out.println("Driving "+Brand);
	}
	public void start() {
		System.out.println("Starting "+Brand);
	}
	public void getinfo() {
		System.out.println(Year+" "+ Brand+" "+Model+", "+Color+", " +Milage +", "+"$"+Price+" ");
	}
	
}
