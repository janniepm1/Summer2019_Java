package Day45_Inheritance;

public class protected_vs_default {

	protected String name;
	String id;
	
	protected void printHello() {
		System.out.println("Hello");
	}
	void printHola() {
		System.out.println("Hola");
	}
	
}
class cybertek{
	public static void main(String[] args) {
		protected_vs_default obj=new protected_vs_default();
		
		obj.printHello();
		obj.printHola();
		System.out.println(obj.name);
		System.out.println(obj.id);
	}
}
