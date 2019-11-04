package Day37Classandobjects;

public class CarObjects {
	//access modifier
	public static void main(String[] args) {
		
		Car    car1=   new   Car();
	//classname	objectname	 keyword	constructor
		
		car1.Brand="BMW";
		car1.Color="White";
		car1.Milage=100000;
		car1.Model="X6";
		car1.Price=15000.5;
		car1.Year=2000;
		System.out.println(car1.Brand);//BMW
		System.out.println(	car1.Color="White");
		System.out.println(car1.Milage=100000);
		System.out.println(car1.Model="X6");
		System.out.println(car1.Price=15000.5);
		System.out.println(car1.Year=2000);
		
		
		System.out.println("================");
		Car car2=new Car();
		System.out.println(car2.Brand);//null
		
		car2.Brand="Toyota";
		car2.Model="Corolla";
		car2.Color="Red";
		car2.Milage=106300;
		car2.Year=2002;
		car2.Price=2000;
		
		System.out.println(car2.Brand="Toyota");
		System.out.println(car2.Model="Corolla");
		System.out.println(car2.Color="Red");
		System.out.println(car2.Milage=106300);
		System.out.println(car2.Year=2002);
		System.out.println(car2.Price=2000);
		
		car1.drive();//driving bmw
		car2.drive();//driving toyota
		
		car1.start();
		car2.start();
		car2.getinfo();
		
		Car car3=new Car();
		
		car3.Brand="Lexus";
		car3.Model="RX350";
		car3.Year=2020;
		car3.Milage=25000;
		car3.Color="Purple";
		car3.Price=25999;
		
		car3.getinfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
