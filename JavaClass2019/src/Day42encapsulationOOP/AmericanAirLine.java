package Day42encapsulationOOP;

public class AmericanAirLine {
	public static void main(String[] args) {
		EmployeeInfo emrah=new EmployeeInfo();
		emrah.setName("Emrah");
		//System.out.println(emrah.setName("Emrah"));compile error because is 
	
System.out.println(emrah.getName());

	emrah.setSSN(38193819);
	System.out.println(emrah.getSSN());
	
	emrah.setAge((byte)38);
	System.out.println(emrah.getAge());
	
	emrah.setSalary(120000);
	System.out.println(emrah.getSalary());
	
	
	EmployeeInfo Shirin=new EmployeeInfo();
	Shirin.setName("Shirin");
	Shirin.setAge((byte)20);
	Shirin.setSSN(999999999);
	Shirin.setSalary(2341234);
	
	
	System.out.println(Shirin.getName());
	System.out.println(Shirin.getSalary());
	System.out.println(Shirin.getSSN());
	System.out.println(Shirin.getAge());
	
	EmployeeInfo Gulnur=new EmployeeInfo();
	Gulnur.setInfo("Gulnur", 2144334,(byte)33,12000);
	}
	
	}

