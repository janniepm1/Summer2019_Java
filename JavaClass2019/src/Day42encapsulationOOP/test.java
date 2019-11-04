package Day42encapsulationOOP;

public class test {
	public static void main(String[] args) {
		testData obj=new testData();
		System.out.println(obj.getName());
		System.out.println(obj.getID());
		
		
		
		//modify obj.name
		obj.setName("Gulnur");
		System.out.println(obj.getName());
		
		obj.setID(400);
		System.out.println(obj.getID());
	}

}
