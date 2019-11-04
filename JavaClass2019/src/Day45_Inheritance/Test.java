package Day45_Inheritance;
import Day45_Inheritance.protected_vs_default;

public class Test {
	
public static void main(String[] args) {
	protected_vs_default obj=new protected_vs_default();
	obj.printHello();
	obj.printHola();
	
	System.out.println(obj.name);
	System.out.println();
}
}
