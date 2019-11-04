package day29Returnmethod;

public class methoddeclaration {
	
		/*
		 * retuen methods: 	ACCES MODIFIER SPECIFIER RETURN NAME(PARAETER){}
		 * 						public static void
		 * 
		 * 	return type;void or other data type (int,string,char etc)
		 * if the return type is void the method does not return any value
		 * if the return type is not void: the method ,must return a value
		 */
	//void does no return any value
	public static void main(String[] args) {
		name();//string value
		System.out.println(name());//return methods are either printed or assigned 
	String str=name();
	System.out.println(str);
	
	}
		public static void method1() {
			System.out.println("Hello");
		}
		//if the return type method is not void:
		//you will have to use return statement :
		//is used for exitting the method, we can also use
		//return method:1 does not have void as return type
		//2.- must return a value if not compile error
		//3.- must return value must match with the return type of method
		//4.- the method body must be close with return statement 
		//5.-can only be one return type
		public static String name() {
			return "Batch12";//return exists the method immediately

		}
		public static boolean answer() {
			return true;
			
			
			
		}
		
		
	
}
