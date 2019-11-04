package Day27_customMethods;

public class VOIDMETHOD {
	/*
	 * Declaration of method: 
	 * access-modifier	specifier 	return-type		methodname(){}
	 */					//statements
	public static void main(String[] args) {
		myFirstMethod();
	even1to100();
	
	/*
	 * method is grouping a series of statements to perform specific task benefits:reusable
		can avoid repeating the same set of statements                         
		also your code will look more organized                                                                        
	 */
		}
	
	public static void even1to100() {
		for(int i=0; i<= 100; i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.print(i+",");
	}
	}
	
	public static void myFirstMethod() {
		
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Khurshed");
	}

	
}
