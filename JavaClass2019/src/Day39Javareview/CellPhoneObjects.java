package Day39Javareview;

public class CellPhoneObjects { 
	
	
	public static void main(String[] args) {
		CellPhones phone1=new CellPhones();//default constructor
		System.out.println(phone1.brand);
		System.out.println(phone1.color);
		System.out.println(phone1.price);
		System.out.println(phone1.model);//will print default 
		System.out.println(phone1.screenSize);
		
		CellPhones phone2=new CellPhones("Samsung",500, "Black", 6.5, "Galaxy");
		phone2.GetInfo();
		
		CellPhones phone3=new CellPhones("Motorolla",200, "Gray", 6.1,"z2 Play");
		phone3.GetInfo();
		
		CellPhones phone4=new CellPhones("Nokia", 20, "Red", 6.1, "Gt-I7500");
		phone4.GetInfo();
		CellPhones[] phones= {phone1,phone2,phone3,phone4};
		//brand of phone3
		phones[2].GetInfo();
		
		
		
			
		}
	}


